package org.teamA02.iso.server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import auxiliary.ThrowableConsumer;
import auxiliary.Utils;

public class Broker {
	private static Broker instance = null;

	public final static String HOST = "";
	public final static String PORT = "";
	public final static String DB_NAME = "";
	public final static String USER = "";
	public final static String PASSWORD = "";

	// TODO: Use formatting to make this prettier
	// TODO: store personal data in plain text so that it does not go into a commit
	public static String URL = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DB_NAME + "?" + "user=" + USER + "&password="
			+ PASSWORD;

	public static Broker getInstance() throws SQLException {
		if (instance == null) {
			instance = new Broker();
		}
		return instance;

	}

	public int insert(String SQL, ThrowableConsumer<PreparedStatement, SQLException> fillPstmt) throws SQLException {
		return update(SQL, fillPstmt);
	}

	public int insert(String SQL) throws SQLException {
		return update(SQL);
	}

	public int update(String SQL) throws SQLException {
		return update(SQL, stmt -> {
		});
	}

	public int update(String SQL, ThrowableConsumer<PreparedStatement, SQLException> fillPstmt) throws SQLException {
		int res = 0;
		try (Connection conn = DriverManager.getConnection(URL)) {
			try (PreparedStatement pstmt = conn.prepareStatement(SQL)) {
				fillPstmt.accept(pstmt);
				res = pstmt.executeUpdate();
			}
		}
		return res;
	}

	public SelectResult select(String SQL) throws SQLException {
		return select(SQL, stmt -> {
		});
	}

	public SelectResult select(String SQL, ThrowableConsumer<PreparedStatement, SQLException> fillPstmt)
			throws SQLException {
		SelectResult result = new SelectResult();

		try (Connection conn = DriverManager.getConnection(URL)) {
			try (PreparedStatement pstmt = conn.prepareStatement(SQL)) {
				fillPstmt.accept(pstmt);
				ResultSet queryResult = pstmt.executeQuery();
				ResultSetMetaData metaData = queryResult.getMetaData();

				while (queryResult.next()) {
					result.insertRow();
					for (int i = 1; i <= metaData.getColumnCount(); i++) {
						// This avoids conflicts between attributes which have the same name in
						// different tables
						String attributeName = "";
						if (!metaData.getTableName(i).equals("")) {
							attributeName = Utils.capitalize(metaData.getTableName(i)) + ".";
						}
						attributeName += metaData.getColumnLabel(i);
						result.addAttribute(attributeName, queryResult.getObject(i));
					}
				}
			}
		}
		return result;
	}
}
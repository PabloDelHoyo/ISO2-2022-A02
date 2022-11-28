package org.teamA02.iso.server;

import java.math.BigInteger;
import java.sql.Date;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Row {

	private Map<String, Object> attributes = new HashMap<>();

	public void addAttribute(String columnLabel, Object obj) {
		attributes.put(columnLabel, obj);
	}

	public String[] getAttributeNames() {
		return attributes.keySet().stream().toArray(String[]::new);
	}

	public boolean isNull(String columnLabel) {
		return getObject(columnLabel) == null;
	}

	public long getLong(String columnLabel) {
		return (long) getObject(columnLabel);
	}

	public int getInt(String columnLabel) {
		Object obj = getObject(columnLabel);

		if (obj instanceof BigInteger) {
			return ((BigInteger) obj).intValueExact();
		}

		if (obj instanceof Long) {
			return (int) getLong(columnLabel);
		}

		return (int) obj;
	}

	public LocalDate getDate(String columnLabel) {
		Date sqlDate = (Date) attributes.get(columnLabel);
		return sqlDate.toLocalDate();
	}

	public Object getObject(String columnLabel) {
		if (attributes.containsKey(columnLabel)) {
			return attributes.get(columnLabel);
		}
		throw new RuntimeException(columnLabel + " is not a valid attribute name");
	}

	public String getString(String columnLabel) {
		return String.valueOf(getObject(columnLabel));
	}

	public boolean getBoolean(String columnLabel) {
		return getInt(columnLabel) == 1;
	}

}

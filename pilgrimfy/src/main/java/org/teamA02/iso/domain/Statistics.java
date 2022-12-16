package org.teamA02.iso.domain;

public class Statistics {
	private Integer businessesNum;
	private Integer pilgrimsNum;
	private Integer happyPilgrmsNum;
	public Statistics(Integer businessesNum, Integer pilgrimsNum, Integer happyPilgrmsNum) {
		super();
		this.businessesNum = businessesNum;
		this.pilgrimsNum = pilgrimsNum;
		this.happyPilgrmsNum = happyPilgrmsNum;
	}
	public Integer getBusinessesNum() {
		return businessesNum;
	}
	public void setBusinessesNum(Integer businessesNum) {
		this.businessesNum = businessesNum;
	}
	public Integer getPilgrimsNum() {
		return pilgrimsNum;
	}
	public void setPilgrimsNum(Integer pilgrimsNum) {
		this.pilgrimsNum = pilgrimsNum;
	}
	public Integer getHappyPilgrmsNum() {
		return happyPilgrmsNum;
	}
	public void setHappyPilgrmsNum(Integer happyPilgrmsNum) {
		this.happyPilgrmsNum = happyPilgrmsNum;
	}
	public void generateAnalysis() {
		
	}
	public void generateStatistics() {
		
	}

}

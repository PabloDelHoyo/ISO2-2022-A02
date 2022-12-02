package org.teamA02.iso.domain;

import java.util.Date;

public class Stage {
	String stateName;
	Date stageStartDate;
	String stageTime;
	Float stageLength;
	Integer stageDifficulty;
	public Stage(String stateName, Date stageStartDate, String stageTime, Float stageLength, Integer stageDifficulty) {
		super();
		this.stateName = stateName;
		this.stageStartDate = stageStartDate;
		this.stageTime = stageTime;
		this.stageLength = stageLength;
		this.stageDifficulty = stageDifficulty;
	}
	public String getStateName() {
		return stateName;
	}
	public Date getStageStartDate() {
		return stageStartDate;
	}
	public String getStageTime() {
		return stageTime;
	}
	public Float getStageLength() {
		return stageLength;
	}
	public Integer getStageDifficulty() {
		return stageDifficulty;
	}
	public void setStageStartDate(Date stageStartDate) {
		this.stageStartDate = stageStartDate;
	}
	
}

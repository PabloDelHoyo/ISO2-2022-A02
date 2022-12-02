package org.teamA02.iso.domain;
import java.util.Date;
public class Route {
	Stage[] stages;
	Integer difficulty;
	Date startDate;
	String time;
	public Route(Stage[] stages, Integer difficulty, Date startDate, String time) {
		super();
		this.stages = stages;
		this.difficulty = difficulty;
		this.startDate = startDate;
		this.time = time;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Stage[] getStages() {
		return stages;
	}
	public Integer getDifficulty() {
		return difficulty;
	}
	public String getTime() {
		return time;
	}
	public void addStage(Stage[] stages, Integer i, Stage stage) {
		stages[i] = stage;
	}
	public void removeStage(Stage[] stages, Integer i) {
		
	}
	
}

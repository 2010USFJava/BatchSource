package com.revature.beans;

import com.revature.enums.Day;

public class Vacation {
	private String activity;
	int durationInDays;
	private Day startDay;
	private Day endDay;
	public Vacation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vacation(String activity, int durationInDays, Day startDay, Day endDay) {
		super();
		this.activity = activity;
		this.durationInDays = durationInDays;
		this.startDay = startDay;
		this.endDay = endDay;
	}
	public String getActivity() {
		return activity;
	}
	public void setActivity(String activity) {
		this.activity = activity;
	}
	public int getDurationInDays() {
		return durationInDays;
	}
	public void setDurationInDays(int durationInDays) {
		this.durationInDays = durationInDays;
	}
	public Day getStartDay() {
		return startDay;
	}
	public void setStartDay(Day startDay) {
		this.startDay = startDay;
	}
	public Day getEndDay() {
		return endDay;
	}
	public void setEndDay(Day endDay) {
		this.endDay = endDay;
	}
	@Override
	public String toString() {
		return "Vacation [activity=" + activity + ", durationInDays=" + durationInDays + ", startDay=" + startDay
				+ ", endDay=" + endDay + "]";
	}
	
	
}

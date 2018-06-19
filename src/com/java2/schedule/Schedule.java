package com.java2.schedule;

public class Schedule {
	int weekDay;
	int startTime;
	String room;
	public int getWeekDay() {
		return weekDay;
	}
	public void setWeekDay(int weekDay) {
		this.weekDay = weekDay;
	}

	String subject;
	int Duration;

	public Schedule() {
		super();
	}
	public Boolean isAvaliable(int weekDay,int startTime){
		Boolean a = false;
		if(this.weekDay!=0 && this.startTime<24) {
			a = true;
		}
		return a;
	}
	public int getStartTime() {
		return startTime;
	}

	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getDuration() {
		return Duration;
	}

	public void setDuration(int duration) {
		Duration = duration;
	}
	public Schedule(int weekDay, int startTime, String room, String subject, int duration) {
		super();
		this.weekDay = weekDay;
		this.startTime = startTime;
		this.room = room;
		this.subject = subject;
		Duration = duration;
	}

	
}

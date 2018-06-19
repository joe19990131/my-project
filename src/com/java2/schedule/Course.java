package com.java2.schedule;

public class Course {
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
	int duration;

	public Course() {
		super();
	}
	public Boolean isAvaliable(int weekDay,int startTime){
		Boolean a = false;
		if(this.weekDay == weekDay && this.startTime == startTime) {
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
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	public Course(int weekDay, int startTime, String room, String subject, int duration) {
		super();
		this.weekDay = weekDay;
		this.startTime = startTime;
		this.room = room;
		this.subject = subject;
		this.duration = duration;
	}

	
}

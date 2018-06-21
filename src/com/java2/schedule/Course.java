package com.java2.schedule;

import java.util.ArrayList;
import java.util.List;

//新增啟動方法
public class Course {
	int weekDay;
	int startTime;
	String room;
	String subject;
	int duration;
	
	List<Course> courses = new ArrayList();

	public int getWeekDay() {
		return weekDay;
	}

	public void setWeekDay(int weekDay) {
		this.weekDay = weekDay;
	}

	public Course() {
		super();
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
	
	public Boolean isAvaliable(int weekDay, int startTime) {
		
		boolean a = false;
		if (this.weekDay == weekDay && this.startTime <= startTime && startTime <= (this.startTime + this.duration)) {
			a = false;
			
		} else if (this.weekDay == weekDay && this.startTime >= startTime
				&& startTime >= (this.startTime + this.duration)) {
			a = true;
		
		}
		return a;
	}

}

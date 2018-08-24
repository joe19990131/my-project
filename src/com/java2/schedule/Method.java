package com.java2.schedule;

public class Method {
	public void isAvaliable(int wd, int stt) {
		Course course = new Course();
		for (int i = 0; i < course.courses.size(); i++) {
			course.courses.get(i);
			if (course.getWeekDay() == wd) {
				if ((course.getStartTime() + course.getDuration()) < stt || stt < course.getStartTime()) {
					System.out.println("【有空檔】");
					break;
				} else {
					System.out.println("【有課: " + course.room + " " + course.subject + " 到 "
							+ (course.startTime + course.duration) + "時 】");
					break;
				}
			} else {
				continue;
			}
		}
	}
}

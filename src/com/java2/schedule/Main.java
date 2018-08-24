package com.java2.schedule;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/* 有一文字檔儲存了課表資料(schedule.txt)
 * 請讀取資料後，設計程式可檢查是否有空檔?
 * 如:
 * 請輸入星期(1-7):2
 * 請輸入時(0-24):11
 * 【有空檔】
 * 請輸入星期(1-7):4
 * 請輸入時(0-24):14
 * 【有課: C004 English 到 16時 】
 */
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Course course = new Course();
			Method m = new Method();
			FileReader fr = new FileReader("schedule.txt");
			BufferedReader in = new BufferedReader(fr);
			String line = in.readLine();
			while (line != null) {
				String[] token = line.split(",");
				int weekDay = Integer.parseInt(token[0]);
				int startTime = Integer.parseInt(token[1]);
				int duration = Integer.parseInt(token[2]);
				String room = token[3];
				String subject = token[4];
				course.courses.add(new Course(weekDay, startTime, room, subject, duration));

				line = in.readLine();

			}
			System.out.println("共讀取" + (course.courses.size()) + "筆資料");
			Scanner sc1 = new Scanner(System.in);
			Scanner sc2 = new Scanner(System.in);
			System.out.println("Please enter the day：");
			int wd = sc1.nextInt();
			System.out.println("Please enter the start time：");
			int stt = sc2.nextInt();
			// m.isAvaliable(wd, stt);
			for (int i = 0; i < course.courses.size(); i++) {
				course.courses.get(i);
				if (course.getWeekDay() == wd && stt < (course.getStartTime() + course.getDuration())
						&& stt >= course.getStartTime()) {
					System.out.println("【有課: " + course.room + " " + course.subject + " 到 "
							+ (course.startTime + course.duration) + "時 】");
					break;
				} else {
					continue;
				}

			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

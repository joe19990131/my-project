package com.java2.schedule;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.security.auth.Subject;

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
			FileReader fr = new FileReader("schedule.txt");
			BufferedReader in = new BufferedReader(fr);
			String line = in.readLine();
			while(line!=null) {
				String[] token = line.split(",");
				int weekDay = Integer.parseInt(token[0]);
				int startTime = Integer.parseInt(token[1]);
				int duration = Integer.parseInt(token[2]);
				String room = token[3];
				String subject = token[4];
				course.courses.add(new Course(weekDay, startTime, room, subject, duration));
			
				line = in.readLine();

			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

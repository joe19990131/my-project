package com.java2.collection;

import java.util.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		//可重複, 有排序, 有索引 一個一個放
		//方法add get set isEmpty remove
		list.add(1);
		list.add(3);
		list.add(4);
		list.add(1);
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(3);
		set.add(4);
		set.add(1);
		Set<String> set2 = new HashSet<>();
		//不可重複, 順數不定
		set2.add("joe");
		set2.add("jack");
		set2.add("sue");
		set2.add("joe");
		Map<String,String> stock = new TreeMap<>();
		//add clear 
		stock.put("0001","a");
		stock.put("0002","b");
		stock.put("0003","c");
		stock.put("0004","d");
		System.out.println(list);
		System.out.println(set);
		System.out.println(set2);
		System.out.println(stock);
	}

	
}

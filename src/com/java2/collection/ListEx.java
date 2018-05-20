package com.java2.collection;

import java.util.*;

public class ListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= 7; i++) {
			list.add(i);
		}

		list.remove(6);
		list.remove(4);
		list.remove(2);
		list.remove(0);
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++)

				if (list.get(i) < list.get(j)) {
					int tmp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, tmp);
				}
		}
		System.out.print(list.get(0)+" "+list.get(1)+" "+list.get(2));
	}

}

package com.sun.learn.maintest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ReflectTest {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(253);
		list.add(258);
		list.add(325);
		list.add(158);
		list.add(169);
		list.add(348);
		
		//Collections.sort(list);
		
		
		Collections.sort(list,new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                // 返回值为int类型，大于0表示正序，小于0表示逆序
            	System.out.println(o1-o2);
                return o1-o2;
            }
        });
		
		
	}

}

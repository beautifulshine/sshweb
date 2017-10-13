package com.li.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.codehaus.jackson.map.util.Comparators;

import java.util.Comparator;



@SuppressWarnings("unused")
public class Demo2 {
	
public static void main(String[] args) {
	//存储100个数字
	List<Integer> list=new ArrayList<Integer>();
	//Set无序，不可重复，存储最终的集合
	Set<Integer> set=new HashSet<Integer>();
	
	//产生100个随机数字
	Random random=new Random();
	for(int i=0;i<100;i++){
		list.add(random.nextInt(100));
	}
	
	//排序，从小到大
	Collections.sort(list,new Comparators<Integer>(){
		public int compare(Integer o1, Integer o2) {
			return o1.compareTo(o2) ;
		}
	});
	
	//添加集合，set自动去重，不能用set.add方法
	set.addAll(list);
	
	System.out.println(set);
	System.out.println(set.size());
}



}

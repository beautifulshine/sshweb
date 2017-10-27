package com.li.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;



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

	//添加集合，set自动去重，不能用set.add方法
	set.addAll(list);
	
	System.out.println(set);
	System.out.println(set.size());
	
	List<Integer> list2=new ArrayList<Integer>();
	list2.addAll(set);
	//排序，从小到大
	Collections.sort(list2, new Comparator<Integer>() {

		@Override
		public int compare(Integer o1, Integer o2) {
			/*if (o1>o2) {
				return 1;
			}else if (o1<o2) {
				return -1;
			}else {
				
				return 0;
			}*/
			return o1.compareTo(o2);//从大到小是o2.compareTo(o1)
		}
	});
	System.out.println(list2);
}
}

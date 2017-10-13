package com.li.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class RanNum {
	/*
	 * 1.添加100个随机数字，去重，然后按从小到大排序
	 */

	public void getRanNum(){
    Random rd=new Random();
    int[] a=new int[100];
    for(int i=0;i<100;i++){
          a[i]=rd.nextInt(100);                 
    }
    for(int i=0;i<a.length;i++){
    	System.out.println("排序前---"+a[i]);
    }
  int temp;
  for(int  j=0;j<100;j++){
       for(int k=0;k<99;k++){
             if(a[k+1]<a[k]){
                   temp=a[k];
                   a[k]=a[k+1];
                   a[k+1]=temp;
             }
        }
  }
  List list = new ArrayList();
  //遍历数组往集合里存元素
  for(int i=0;i<a.length;i++){
      //如果集合里面没有相同的元素才往里存
      if(!list.contains(a[i])){
          list.add(a[i]);
      }
  }
  //toArray()方法会返回一个包含集合所有元素的Object类型数组
  Object[] newArr = list.toArray();
  //遍历输出一下测试是否有效
  for(int i=0;i<newArr.length;i++){
      System.out.print(" "+newArr[i]);
  }
 /* List<Integer> numList = new ArrayList<Integer>();
  for (int i : a)
      numList.add(i);
  Set<Integer> numSet = new HashSet<Integer>();
  numSet.addAll(numList);
//  System.out.println(numSet);
  Object[] arrayResult = numSet.toArray();
  for(int i=0;i<arrayResult.length;i++){
  	System.out.println("排序后---"+a[i]);
  }*/
}
}

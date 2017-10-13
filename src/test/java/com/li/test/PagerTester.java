package com.li.test;

import java.util.ArrayList;
import java.util.List;

public class PagerTester {
	 public static void main(String[] args) {
	        
	        Page<String> pager = new Page<String>();
	        
	        List<String> content = new ArrayList<String>();
	        content.add("str1");
	        content.add("str2");
	        content.add("str3");
	        content.add("str4");
	        content.add("str5");
	        content.add("str6");
	        content.add("str7");
	        content.add("str8");
	        content.add("str9");
	        content.add("str10");
	        content.add("str11");
	        content.add("str12");
	        content.add("str13");
	        content.add("str14");
	        content.add("str15");
	        content.add("str16");
	        content.add("str17");
	        
	        
	        System.out.println(pager);

	    }

	}



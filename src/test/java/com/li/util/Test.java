package com.li.util;
public class Test {
	  public static void main(String[] args) {
	        //发送 GET 请求
	        String s=HttpRequest.sendGet("http://fanyi.youdao.com/openapi.do", "keyfrom=<keyfrom>&key=<key>&type=data&doctype=xml&version=1.1&q=good");
	                 
	        System.out.println(s);
	        
	        //发送 POST 请求
	        String sr=HttpRequest.sendPost("http://fanyi.youdao.com/openapi.do", "keyfrom=<keyfrom>&key=<key>&type=data&doctype=json&version=1.1&q=morning");
	        System.out.println(sr);
	    }

}

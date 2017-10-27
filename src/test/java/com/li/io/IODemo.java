package com.li.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class IODemo {
 public static void main(String[] args) {
//		1、读文本
	/* FileReader fileReader=null;
	 BufferedReader bufferedReader=null;
	 try {
		fileReader=new FileReader("sun.txt");
		 bufferedReader=new BufferedReader(fileReader);
		int ch=0;
		char [] cs=new char[1024];
		while((ch=bufferedReader.read(cs))!=-1){
			System.out.println(new String(cs));
		}
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}finally {
		try {
			bufferedReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			fileReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}*/
	 

//		2、写文本
	/* FileWriter fileWriter=null;
	 BufferedWriter bufferedWriter=null;
	 Scanner scanner=new Scanner(System.in);
	 System.out.println("请输入要写的文字");
	 String string= scanner.nextLine();
	 try {
		fileWriter=new FileWriter("run.txt");
		bufferedWriter=new BufferedWriter(fileWriter);
		
		bufferedWriter.write(string);
		
	} catch (IOException e) {
		e.printStackTrace();
	}
	 finally {
	 try {
		bufferedWriter.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
		try {
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}*/
	 
//	 读写文件
	 FileReader fileReader=null;
	 BufferedReader bufferedReader=null;
	 FileWriter fileWriter=null;
	 BufferedWriter bufferedWriter=null;
	 try {
		fileReader=new FileReader("sun.txt");
		 bufferedReader=new BufferedReader(fileReader);
		 fileWriter=new FileWriter("newsun.txt");
		 bufferedWriter=new BufferedWriter(fileWriter);
		int ch=0;
		char [] cs=new char[1024];
		while((ch=bufferedReader.read(cs))!=-1){
			bufferedWriter.write(cs);
		}
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}finally {
		try {
			bufferedWriter.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			fileWriter.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			
			bufferedReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			fileReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
//		3、读图片
	try {
		FileInputStream inputStream=new FileInputStream("1.jpg");
		BufferedInputStream bufferedInputStream=new BufferedInputStream(inputStream);
		byte[] by=new byte[bufferedInputStream.available()];
		int len=0;
		while((len=bufferedInputStream.read(by))!=-1){
			System.out.println(by.toString());
		}
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} 
	 
	 
	 
//		4、写图片 
	FileInputStream inputStream=null;
	BufferedInputStream bufferedInputStream=null;
	FileOutputStream fileOutputStream=null;
	BufferedOutputStream bufferedOutputStream=null;
	try {
		 inputStream=new FileInputStream("1.jpg");
		 bufferedInputStream=new BufferedInputStream(inputStream);
		 fileOutputStream=new FileOutputStream("new.jpg");
		 bufferedOutputStream=new BufferedOutputStream(fileOutputStream);
		byte[] by=new byte[bufferedInputStream.available()];
		int len=0;
		while((len=bufferedInputStream.read(by))!=-1){
			bufferedOutputStream.write(by);
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		try {
			bufferedOutputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			bufferedInputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fileOutputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			inputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	 
}	
}

package com.li.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IODemo {
	/**
	 * 读取文件
	 */
	public static void testReadFile(){
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		try {
			fileReader = new FileReader("d:/io/sun.txt");
			bufferedReader =  new BufferedReader(fileReader);
			int length = -1;
			char[] buffer = new char[1024];//定义一个整数，表示读取的字节数
			while((length = bufferedReader.read(buffer)) != -1 ){
				System.out.println(new String(buffer, 0, length));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			if (bufferedReader != null) {
				try {
					bufferedReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fileReader != null) {
				try {
					fileReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	/**
	 * 文件写入
	 */
	public static void testWriteFile(){
		FileWriter fileWriter = null;
		BufferedWriter bufferedWriter = null;
		Scanner scanner = null;
		try {
			fileWriter = new FileWriter("d:/io/run.txt");
			bufferedWriter = new BufferedWriter(fileWriter);
			System.out.println("请输入要写入的内容");
			scanner = new Scanner(System.in);
	    	String string =	scanner.nextLine();
			bufferedWriter.write(string);
			bufferedWriter.write("abcd");
			bufferedWriter.flush();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			if (bufferedWriter != null) {
				try {
					bufferedWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fileWriter != null){
				try {
					fileWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	/**
	 * 读写文件
	 */
	public static void testReadAndWriteFile(){
		 FileReader fileReader = null;
		 BufferedReader bufferedReader = null;
		 FileWriter fileWriter = null;
		 BufferedWriter bufferedWriter = null;
		 try {
			 fileReader = new FileReader("d:/io/sun.txt");
			 bufferedReader = new BufferedReader(fileReader);
			 fileWriter = new FileWriter("d:/io/newsun.txt");
			 bufferedWriter = new BufferedWriter(fileWriter);
			 int length = 0;
			 char [] cs = new char[1024];
			 while((length=bufferedReader.read(cs)) != -1){
				bufferedWriter.write(cs,0,length);
				bufferedWriter.flush();
			 }
			 }catch (IOException e) {
				e.printStackTrace();
			 }finally {
				try {
				if(bufferedWriter != null){
					bufferedWriter.close();
				}
				if(fileWriter != null){
					fileWriter.close();
				}
				if(bufferedReader != null){
					bufferedReader.close();
				}
				if(fileReader != null){
					fileReader.close();
				}
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		
	}
	
	/**
	 * 读图片
	 */
	public static void testReadImg(){
		FileInputStream inputStream = null;
		BufferedInputStream bufferedInputStream = null;
		try {
			inputStream = new FileInputStream("d:/io/1.jpg");
			bufferedInputStream = new BufferedInputStream(inputStream);
			byte[] by = new byte[bufferedInputStream.available()];
			int len = 0;
			while((len = bufferedInputStream.read(by)) != -1){
				System.out.println(new String(by,0,len));
			}
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			if (bufferedInputStream != null) {
				try {
					bufferedInputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	/**
	 * 写图片
	 */
	public static void testReadAndWriteImg(){
		FileInputStream inputStream = null;
		BufferedInputStream bufferedInputStream = null;
		FileOutputStream fileOutputStream = null;
		BufferedOutputStream bufferedOutputStream = null;
		try {
			 inputStream = new FileInputStream("d:/io/1.jpg");
			 bufferedInputStream = new BufferedInputStream(inputStream);
			 fileOutputStream = new FileOutputStream("d:/io/new.jpg");
			 bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
			 int length = -1;
			 byte[] by = new byte[bufferedInputStream.available()];
			 while((length = bufferedInputStream.read(by)) !=-1){
				bufferedOutputStream.write(by, 0, length);
				bufferedOutputStream.flush();
			 }
			 }catch (IOException e) {
			 	e.printStackTrace();
			 }finally {
				 if (bufferedOutputStream != null) {
					 try {
						bufferedOutputStream.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				 if (fileOutputStream != null) {
					 try {
						 fileOutputStream.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				 if (bufferedInputStream != null) {
					 try {
						 bufferedInputStream.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				 if (inputStream != null) {
					 try {
						 inputStream.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
		}
	}
	
	 public static void main(String[] args) {
	//     testReadFile();
	//	 testWriteFile();
	//	 testReadAndWriteFile();
	//	 testReadImg();
		 testReadAndWriteImg();
	   }	
}

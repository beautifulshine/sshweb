package com.li.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo {
	/**用程序创建一个文件夹，然后建立一个文件，然后往里面写数据
	 * 最后打印出这个文件的一些属性，比如文件大小、路径、文件名
	 * @throws IOException 
	 */
	public static void testFile() throws IOException{
		File dir = new File("d:/io/file");
		if (!dir.exists()) {
			dir.mkdirs();
		}
	File file1= new File(dir+"/test1.txt");
	File file2= new File("d:/io/file/test2.txt");
	if (!file1.exists()) {
		try {
			file1.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	if (!file2.exists()) {
		try {
			file2.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2));
	bufferedWriter.write("run"+"\r\n");//换行
	bufferedWriter.write("fun"+"\r\n");
	bufferedWriter.write("fun"+"\r\n");//换行
	bufferedWriter.write("fun\r\n");
	bufferedWriter.write("end");
	bufferedWriter.flush();
	bufferedWriter.close();
	System.out.println(""+file1.getName());//获得文件名字
	System.out.println(""+file1.getAbsolutePath());//绝对路径
	System.out.println(""+file1.getCanonicalPath());//绝对路径
	System.out.println(""+file1.getPath());//返回文件的相对路径
	System.out.println(""+file1.getFreeSpace());// 返回在分区上剩余的字节数量，包括当前File的路径
	System.out.println(""+file1.getParent());//上级目录
	System.out.println(""+file1.length());//文件的大小
	System.out.println(""+file1.getClass());//文件所属的类
	System.out.println(""+file1.getParentFile());//
	System.out.println(""+file1.getAbsoluteFile());//
	}
	
	/**
	 * 用File类列出一个目录下的所有文件夹和文件
	 * @param file
	 */
	public static void list(File file){
		if (file.isDirectory()) {//判断file是否是目录
	    File[] files = file.listFiles();
	    if (files != null) {
		for(int i =0;i<files.length;i++){
			list(files[i]);//是目录就递归进入目录内再进行判断  
		}	
		}
		}
		System.out.println(file);//file不是目录，就输出它的路径名，这是递归的出口  
	}
	public static void main(String[] args) throws IOException {
		testFile();
		System.out.println("---------------------");
		File file = new File("d:/io"+File.separator);
		list(file);
	}

}

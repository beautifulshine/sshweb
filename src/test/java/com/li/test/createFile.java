package com.li.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class createFile {
	/*
	 * 在本地新建一个文件夹，然后里面建一个记事本，里面随便写一个话
	 */
	public  static void getFile(){
	String path0 = "D:/aa/bb/cc/";
    String path1 = "D:/aa/bb/cc/kkk.txt";
    File f = new File(path0);
    // 创建文件夹
    if (!f.exists()) {
        f.mkdirs();
    }
    f = new File(path1);
    // 创建文件
    if (!f.exists()) {
        try {
            f.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
	
	 public static String txt2String(File file){
	        StringBuilder result = new StringBuilder();
	        try{
	            BufferedReader br = new BufferedReader(new FileReader(file));//构造一个BufferedReader类来读取文件
	            String s = null;
	            while((s = br.readLine())!=null){//使用readLine方法，一次读一行
	                result.append(s);
	            }
	            br.close();    
	        }catch(Exception e){
	            e.printStackTrace();
	        }
	        return result.toString();	
}
	 
	//这是我写的
		public static void main(String[] args) {
			File f = new File("d:/vox");
			// 创建文件夹
			if (!f.exists()) {
				f.mkdirs();
			}
			File file = new File(f.getPath()+"/vox.txt");
			// 创建文件
			if (!file.exists()) {
				try {
					boolean isSuccess = file.createNewFile();
					
					System.out.println(isSuccess);
					
					if(isSuccess){
						FileWriter fw = new FileWriter(file);
						fw.write("voice of youth,voice of freedom");
						fw.flush();
						
						fw.close();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}

			}
		}
	}	 
	 


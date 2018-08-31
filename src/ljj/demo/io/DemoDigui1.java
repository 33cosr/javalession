package ljj.demo.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class DemoDigui1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//System.out.println(fun(10000));
		File dir = getDir();
		//getJavaFile(dir);
		//System.out.println(getFileLength(dir));
		//deleteFolder(dir);
		//File dest = getDir();
		//copy(dir,dest); //如果src 和 dest 相同 就会在src下不断的死循环拷贝，判断一下如果相等，给个提示
		printDir(dir,0);
	}
	
	public static int fun(int n) {
		if(n==1) {
			return 1;
		}else {
			return n*fun(n-1);
		}
	}
	/*
	 * 1. 获取到改问价路径下的所有文件和文件夹，存储在File数组中g
	 * 2. 遍历数组，对没有一个文件或者文件假做判断
	 * 3. 如果是文件 并且后缀是.java 的就打印出来
	 * 4. 如果是文件夹，就递归调用
	 */
	public static File getDir() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个文件路径:");
		while(true) {
			String line = sc.nextLine(); //从键盘录入文件夹路径
			File dir = new File(line); // 封装file对象
			
			//判断
			if(!dir.exists()) {
				System.out.println("你输入的文件夹路径不存在，请重新输入");
			}else if(dir.isFile()) {
				System.out.println("你输入的是一个文件的路径，请换成文件夹路径");
			}else {
				return dir;
			}
		}
	}
	
	/*
	 * 获取所有java文件
	 */
	public static void getJavaFile(File dir) {
		//1. 获取到改文件夹路径下的所有文件和文件夹，存储在File数组中
		File[] files = dir.listFiles();
		
		//2. 遍历数组
		
		for(File file:files) {
			//3. 打印java文件
			if(file.isFile() && file.getName().endsWith(".java")) {
				System.out.println(file);
			}else if(file.isDirectory()) {
				//4. 递归调用
				getJavaFile(file);
			}
		}
	}
	
	
	/*
	 * 获取文件夹大小
	 */
	public static long getFileLength(File dir) {
		//1. 定义一个求和变量
		long length = 0;
		//2. 获取文件夹下所有文件和文件夹
		File[] files = dir.listFiles();
		
		//3. 遍历数组
		for(File file:files) {
			//4.判断是文件就计算大小
			if(file.isFile()) {
				
				length+=file.length();
			}else {
				length+=getFileLength(file);
			}
		}
		
		return length;
	}
	
	
	/*
	 * 删除该文件夹
	 */
	public static void deleteFolder(File dir) {
		//1. 获取该路径小所有文件夹和文件
		
		File[] files = dir.listFiles();
		
		//2. 遍历数组
		
		for(File file:files) {
			//3. 判断是文件就删除
			if(file.isFile()) {
				file.delete();
			}else {
				//4. 是文件夹就递归调用，删除文件
				deleteFolder(file);
			}
		}
		dir.delete();
	}
	
	/*
	 * 文件拷贝
	 * 1.返回值类型是void
	 * 2.蚕食列表 File src，File dest
	 * @throws IOException
	 */
	
	public static void copy(File src, File dest) throws IOException {
		//1. 在目标文件夹中，创建原文件夹，在dest文件中先创建src这个文件夹名称。
		
		File newDir = new File(dest,src.getName());
		newDir.mkdir();
		
		//2. 获取原文件夹中所有的文件和文件夹。存储在File数组中
		File[] files = src.listFiles();
		//3. 遍历数组
		for(File file:files) {
			//4. 如果是文件，就利用IO流读写，实现拷贝
			if(file.isFile()) {
				//利用字节流的原因是，支持拷贝任何类型文件，不只是文本文件
				BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File(newDir,file.getName())));
				int b;
				while((b=bis.read())!=-1) {
					bos.write(b);
				}
				bis.close();
				bos.close();
			}else {
				copy(file,newDir); //拷贝文件夹
			}
		}
	}
	
	// 按照层级打印
	public static void printDir(File dir,int level) {
		//1. 获取所有文件夹和文件，存储在File数组中
		File[] files = dir.listFiles();
		//2. 遍历数组
		for(File file:files) {
			//3. 无论是文件还是文件夹都需要打印
			for(int i=0; i<=level;i++) {
				System.out.print("\t");
			}
			System.out.println(file);
			//4.如果是文件夹 ，递归调用
			if(file.isDirectory()) {
				printDir(file,level+1);
			}
		}
	}
}

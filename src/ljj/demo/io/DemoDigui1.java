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
		//copy(dir,dest); //���src �� dest ��ͬ �ͻ���src�²��ϵ���ѭ���������ж�һ�������ȣ�������ʾ
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
	 * 1. ��ȡ�����ʼ�·���µ������ļ����ļ��У��洢��File������g
	 * 2. �������飬��û��һ���ļ������ļ������ж�
	 * 3. ������ļ� ���Һ�׺��.java �ľʹ�ӡ����
	 * 4. ������ļ��У��͵ݹ����
	 */
	public static File getDir() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ļ�·��:");
		while(true) {
			String line = sc.nextLine(); //�Ӽ���¼���ļ���·��
			File dir = new File(line); // ��װfile����
			
			//�ж�
			if(!dir.exists()) {
				System.out.println("��������ļ���·�������ڣ�����������");
			}else if(dir.isFile()) {
				System.out.println("���������һ���ļ���·�����뻻���ļ���·��");
			}else {
				return dir;
			}
		}
	}
	
	/*
	 * ��ȡ����java�ļ�
	 */
	public static void getJavaFile(File dir) {
		//1. ��ȡ�����ļ���·���µ������ļ����ļ��У��洢��File������
		File[] files = dir.listFiles();
		
		//2. ��������
		
		for(File file:files) {
			//3. ��ӡjava�ļ�
			if(file.isFile() && file.getName().endsWith(".java")) {
				System.out.println(file);
			}else if(file.isDirectory()) {
				//4. �ݹ����
				getJavaFile(file);
			}
		}
	}
	
	
	/*
	 * ��ȡ�ļ��д�С
	 */
	public static long getFileLength(File dir) {
		//1. ����һ����ͱ���
		long length = 0;
		//2. ��ȡ�ļ����������ļ����ļ���
		File[] files = dir.listFiles();
		
		//3. ��������
		for(File file:files) {
			//4.�ж����ļ��ͼ����С
			if(file.isFile()) {
				
				length+=file.length();
			}else {
				length+=getFileLength(file);
			}
		}
		
		return length;
	}
	
	
	/*
	 * ɾ�����ļ���
	 */
	public static void deleteFolder(File dir) {
		//1. ��ȡ��·��С�����ļ��к��ļ�
		
		File[] files = dir.listFiles();
		
		//2. ��������
		
		for(File file:files) {
			//3. �ж����ļ���ɾ��
			if(file.isFile()) {
				file.delete();
			}else {
				//4. ���ļ��о͵ݹ���ã�ɾ���ļ�
				deleteFolder(file);
			}
		}
		dir.delete();
	}
	
	/*
	 * �ļ�����
	 * 1.����ֵ������void
	 * 2.��ʳ�б� File src��File dest
	 * @throws IOException
	 */
	
	public static void copy(File src, File dest) throws IOException {
		//1. ��Ŀ���ļ����У�����ԭ�ļ��У���dest�ļ����ȴ���src����ļ������ơ�
		
		File newDir = new File(dest,src.getName());
		newDir.mkdir();
		
		//2. ��ȡԭ�ļ��������е��ļ����ļ��С��洢��File������
		File[] files = src.listFiles();
		//3. ��������
		for(File file:files) {
			//4. ������ļ���������IO����д��ʵ�ֿ���
			if(file.isFile()) {
				//�����ֽ�����ԭ���ǣ�֧�ֿ����κ������ļ�����ֻ���ı��ļ�
				BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File(newDir,file.getName())));
				int b;
				while((b=bis.read())!=-1) {
					bos.write(b);
				}
				bis.close();
				bos.close();
			}else {
				copy(file,newDir); //�����ļ���
			}
		}
	}
	
	// ���ղ㼶��ӡ
	public static void printDir(File dir,int level) {
		//1. ��ȡ�����ļ��к��ļ����洢��File������
		File[] files = dir.listFiles();
		//2. ��������
		for(File file:files) {
			//3. �������ļ������ļ��ж���Ҫ��ӡ
			for(int i=0; i<=level;i++) {
				System.out.print("\t");
			}
			System.out.println(file);
			//4.������ļ��� ���ݹ����
			if(file.isDirectory()) {
				printDir(file,level+1);
			}
		}
	}
}

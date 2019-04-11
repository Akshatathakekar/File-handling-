package com.capgemini.files.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileHandlingDemo {
public static void main(String[] args) throws IOException {
	
//	File file=new File("C:\\java_core_pgm\\junit_commands.txt");
//	System.out.println(file.exists());
//	
//	File folder=new File("C:\\java_core_pgm");
//	System.out.println(folder.exists());
	
	File file=new File("test.txt");
	if(!file.exists())
	{
		file.createNewFile();
	System.out.println("File created successfully");
	
	}
	//FileWriter writer=new FileWriter(file);
	//BufferedWriter writer=new BufferedWriter(new FileWriter(file));
	//FileWriter writer=new FileWriter(file,true);
	
	//PrintWriter writer=new PrintWriter(new FileWriter(file,true));
//	writer.write("hello.....\n");
//	writer.newLine();
//	writer.write("How are you?....\n");
//	writer.newLine();
//
//	writer.write("bye....\n");
//	writer.write("bye....\n");

//	writer.println("Hello....");
//	writer.println("bye....");
//	writer.println("How are you?....");
//
//		writer.close();
//	
//	
//	FileReader reader=new FileReader("C:\\Java_Workspace\\bank-app\\src\\com\\capgemini\\bankapp\\model\\BankAccount.java");
//	BufferedReader bReader=new BufferedReader(reader);
//	
//	PrintWriter writer=new PrintWriter("BankAccount.java");
//	
//	String content;
//	
//	while((content=bReader.readLine())!=null)
//	{
//		//System.out.println(content);
//		writer.println(content);
//	}
//	
//	writer.close();
//	bReader.close();
//	reader.close();
//	
//	System.out.println("Content has been written successsfully");
//	
//	File windowsDirectory =new File("c:\\windows");
//	System.out.println(windowsDirectory.isDirectory());
//	String content[]=windowsDirectory.list();
//	
//	for(String s:content)
//	{
//		System.out.println(s);
//	}
	
	File newDir=new File("Mydirectory");
	if(!newDir.exists())
	{
		newDir.mkdir();
		System.out.println("Folder is created successfully");
	}
	
	File file1=new File(newDir,"myfile.txt");
	if(!file1.exists())
	{
		file1.createNewFile();
		System.out.println("file is successfully created");
	}
}}

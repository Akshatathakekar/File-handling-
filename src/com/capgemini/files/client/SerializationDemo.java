package com.capgemini.files.client;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo  {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		DebitCard debitCard=new DebitCard(111122222, 234, 11, 2021);
		BankAccount account=new BankAccount(1111, "John", "Saving", 20000, debitCard);
		
		//serialization process
		FileOutputStream fileOutputStream=new FileOutputStream("account.ser");
		ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(account);
		objectOutputStream.close();
		
		FileInputStream fileInputStream =new FileInputStream("account.ser");
		ObjectInputStream inputStream=new ObjectInputStream(fileInputStream);
		
		BankAccount account2=(BankAccount)inputStream.readObject();
		inputStream.close();
		
			
		System.out.println(account2);
	}
}

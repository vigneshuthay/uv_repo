package com.java.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialization implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	private int a;
	private String b;

	public Serialization(int a,String b){
		this.a = a;
		this.b = b;
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException{

		Serialization serialization = new Serialization(1,"One");

		String fileName = "D://aaaaaaa/InputFile.txt";

		FileOutputStream fileOutputStream = new FileOutputStream(fileName);

		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

		objectOutputStream.writeObject(serialization);

		objectOutputStream.close(); 
		fileOutputStream.close(); 

		System.out.println("Serialization Done ....");

		FileInputStream file = new FileInputStream(fileName);

		ObjectInputStream in = new ObjectInputStream(file); 

		Serialization object1 = (Serialization)in.readObject();

		in.close();
		file.close();

		System.out.println("De-Serialization Done ....");
		
		System.out.println("a = " + object1.a);
		System.out.println("b = " + object1.b);

	}

}


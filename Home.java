package com.Library;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Home {

	static Scanner S = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("******************LIBRARY***************");
		System.out.println("******************WELCOME***************");

		System.out.println("Press 1 to login ");
		System.out.println("Press 2 to Register");
		int a = S.nextInt();
		if (a == 1) {

			login();

		}

		else if (a == 2) {

			Register();

		}

	}

	private static void Register() {
		// TODO Auto-generated method stub
		System.out.println("Enter your User Name");
		String a = S.next();
		System.out.println("Enter your Password");
		String b = S.next();
		System.out.println("Enter your Confirm Password");
		String c = S.next();
		if (b.equals(c)) {
			System.out.println("Success please login");
			login();

		} else {
			System.out.println("Check your password");
			Register();

		}

	}

	private static void login() {
		// TODO Auto-generated method stub
		System.out.println("Press \n 1 for Student \n 2 for Staff");
		int b = S.nextInt();
		if (b == 1) {
			System.out.println("Enter the user Name");
			String c = S.next();
			System.out.println("Enter the password");
			String d = S.next();
		
		
				if (c.equals("althaf") && d.equals("1234")) {
				System.out.println("Student Login Success");
				ArrayList <String> e = addBooks();
				Student(e);					
				
					}
		
		} 	
		
		else if(b==2) {
			System.out.println("Enter your staff ID");
			String e = S.next();

			System.out.println("Logged in AS STAFF ID:" + e);

			addBooks();
		}
	
		else 
		{
			System.out.println("Check the credentials");
		}

	}

	private static ArrayList<String> addBooks() 
	{
		// TODO Auto-generated method stub
		System.out.println("How Many to add?");
		int n = S.nextInt();
		ArrayList<String> a = new ArrayList<>(n);
		ArrayList<Integer> b = new ArrayList<>(n);

		for (int i = 1; i <= n; i++) {
			System.out.println("Enter the Book Name");
			String f = S.next();
			a.add(f);
			System.out.println("Enter the Price");
			int g = S.nextInt();
			b.add(g);

		}

		// showing books and price details
		System.out.println("List of Books");
		for (int i = 0; i < a.size(); i++) {
			System.out.println("Book \t" + a.get(i) + "\t Price \t" + b.get(i));
			}
		System.out.println("Added Successfully");
		return  a;
		
		
}
	

	private static void Student(ArrayList<String> b) {
		// TODO Auto-generated method stub
		ArrayList<String> d = new ArrayList<String>(b);
		System.out.println("Search  Book  Available ?");
		String h = S.next();
		System.out.println("Available Book to purchase \t" + h + "\t" + Collections.frequency(b, h));
		System.out.println("Wish to purchase press y or n");
		String a = S.next();
		if(a.equalsIgnoreCase("y"))
		{
			
			System.out.println("Success");
		
				b.remove(h);
				System.out.println("Available Book to purchase \t" + h + "\t" + Collections.frequency(b, h));
				
			
		}
		
		
		
	}
}

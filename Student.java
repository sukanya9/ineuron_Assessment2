package assignment2;

import java.util.Scanner;

public class Student {
	
	String name;
	long phoneno;
	String email;
	String stud_address;
	String stus_status;
	public Student() {
		
	}

	public void displayStudent(String firstName, String emailId, long phone,String address,String status) {
		name = firstName;
		email = emailId;
		phoneno = phone;
		stud_address=address;
		stus_status=status;
		
	}
	public static void main(String[] args) {
		//String name,email,address;
		Scanner sc=new Scanner(System.in);
		Object s1[]=new Object[10];
		
		
		System.out.println("Please enter number of Students:");
		int n1=sc.nextInt();
		for( int i=0;i<=n1;i++) {
		System.out.println("Enter Student Name:");
		s1[i]=sc.nextLine();
		System.out.println("Enter Email:");
		 s1[i]=sc.nextLine();
		System.out.println("Enter Address:");
		 s1[i]=sc.nextLine();
		System.out.println("Please enter which student details you want:"+s1[i]);
		sc.nextInt();
		
		}
		sc.close();

	}

}

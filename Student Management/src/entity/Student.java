package entity;

import java.util.Scanner;

public class Student {

	int Enrollmentid;
	String Firstname;
	String Lastname;
	String Course;
	String Address;
	String Gender;
	int Age;
	
	Student(int enrollmentid,String firstname,String lastname,String course,String address,String gender,int age ){
		this.Enrollmentid= enrollmentid;
		this.Firstname =firstname;
		this.Lastname = lastname;
		this.Course = course;
		this.Address = address;
		this.Gender = gender;
		this.Age= age;
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	
	public void insert() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Enrollment Id: ");
		Enrollmentid  = scanner.nextInt();
		 

		System.out.println("Enter Firstname: ");
		Firstname  = scanner.next();
			 

		System.out.println("Enter Lastname: ");
		Lastname = scanner.next();
				 

		System.out.println("Enter CourseName: ");
		Course = scanner.next();
					 

		System.out.println("Enter Address: ");
		 Address= scanner.next();
						 
	    System.out.println("Enter Gender: ");
	    Gender = scanner.next();
	    
	    System.out.println("Enter Age: ");
	    Age = scanner.nextInt();
						 
						 
	                     }
	
	public void display() {
		System.out.println(" enrollmentId" +Enrollmentid + 
		" \n "  + "firstname : " + Firstname  + 
		" \n lastname :" + Lastname + 
		" \n "  + " course : " + Course   + 
		" \n address :" +Address + " \n  gender : " +
		 Gender +" \n "+ "age : "+Age);
	}
	
	public Student searchByStdrollno(Student[] array , int rollno) {
		
		for(int i = 0 ; i < array.length ; i++) {
			
			if(array[i].Enrollmentid  == rollno)//110
				return array[i];
	}




	return null;



	}
	public int searchByStdfirstname(Student[] array, String firstname) {
		
		Student[] arr = new Student[array.length];
		int count =0;
		
		   for(int i = 0 , j = 0; i< array.length ; i++) {
			   
			   if(array[i].Firstname .equals(firstname)) { // tech    0   3   4
				   
			//	    arr[j] = array[i];
				  array[i].display();
				    count=+1;
			   }
			   
		   }
		
		
		
		return count;
		
		
	}
	public int  searchByStdlastname(Student[] array, String lastname) {
		
		Student[] arr = new Student[array.length];
		int count = 0;
		
		   for(int i = 0 , j = 0; i< array.length ; i++) {
			   
			   if(array[i].Lastname .equals(lastname)) { // tech    0   3   4
				   
				   array[i].display();
				   count = +1;
			   }
			   
		   }
		
		
		
		return count;
		
		
	}
	public void exit() {
		System.out.println("Exit Student record successfully");
	                       }
	
	
	
	
	
}

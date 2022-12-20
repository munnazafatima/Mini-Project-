package entity;

import java.util.Scanner;

public class Menu {
	 static Student S =new Student();
	   static Student[] array =null;
	   
	   public static void options(){
			// CRUD
			int option=0,option1=0,num=0;
			Scanner scanner = new Scanner(System.in);
			do {
				
				  System.out.println(" 1. Student");
				  System.out.println(" 2. Exit");
				  
				   option = scanner.nextInt();// 1 2 3
				
				 
				switch(option) {
				  case  1:
					  do {
						  System.out.println("*********WELCOME TO THE STUDENT PROFILE*********");
						  System.out.println("1. Insert student record");
					       System.out.println("2. View student records");
					       System.out.println("3. Search student record by Enrollment Number");
					       System.out.println("4. Search student record by First Name");
					       System.out.println("5. Search student record by Last Name");
						   System.out.println("6. Exit student portal");
					  
						  
						   option1 = scanner.nextInt();
						   switch(option1) {
						   
						   case 1 :
							      System.out.println("Number of Records");
								  num = scanner.nextInt();
								   array = new Student[num];
									for(int i=0;i<num;i++) {
										
									array[i]=new Student();
									array[i].insert();
									 System.out.println("----------------------------------");
									}
									break;
						   
						   case 2 :
							   for(int i=0;i<num;i++) {
								   array[i].display();
								   System.out.println("----------------------------------");
							   }
							   break;
							   
						   case 3:
							   System.out.println("Enter Student Enrollment Id : ");
							   int rollno = scanner.nextInt();
								
								Student  std1 = S.searchByStdrollno(array , rollno);
								if(std1 == null) {
									System.out.println(" No such record found");
									System.out.println("--------------------------");
								}
								
								else
									std1.display();
									System.out.println("--------------------------");
			
								break;
								
						   case 4:
							   System.out.println(" Enter Student FirstName: ");
								String firstname = scanner.next();// 
								
								Student [] std2 = new Student[array.length];
										int result= S. searchByStdfirstname(array , firstname);
										if(result==0) {
											System.out.println(" No such record found");
										}
								
								/*for(int i = 0 ; i < std2.length ; i++) {
									if(std2[i] != null) {
									std2[i].display();
									System.out.println("--------------------------");
									}
									else {
										System.out.println("No record found");
										System.out.println("--------------------------");
									}
									
								}*/
										
			
								break;
						   case 5:
							   System.out.println(" Enter Student LastName: ");
								String lastname = scanner.next();// 
								
								Student [] std3 = new Student[array.length];
										int result1 = S. searchByStdlastname(array , lastname);
										if(result1==0) {
											System.out.println(" No such record found");
										}
								
							/*	for(int i = 0 ; i < std3.length ; i++) {
									if(std3[i] != null) {
									std3[i].display();
									System.out.println("--------------------------");
									}
									else {
										System.out.println("No record found");
										System.out.println("--------------------------");
									}
									
								}*/
			
								break;
						
						   
						   case 7:
							   
							        S.exit();
							        break;
						   }
					  }while(option1 !=6);
					   
						break;
						
				  case 2:
						System.out.println("Exit  Application Successfully");
						System.exit(0);
				    }
					}while(option!=2);

				}
				
							   

}

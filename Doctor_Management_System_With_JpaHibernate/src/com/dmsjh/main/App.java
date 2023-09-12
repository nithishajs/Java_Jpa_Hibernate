package com.dmsjh.main;

import java.util.*;
import com.dmsjh.dao.*;
import com.dmsjh.model.Doctor;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Doctor d = new Doctor();
		 DoctorDaoImpl dao = new DoctorDaoImpl();
		Scanner sc = new Scanner(System.in);
		
		int choice;
		
		do {
			
			 System.out.println("==================MENU=================");
             System.out.println("1. Enter doctor details");
             System.out.println("2. Display a doctor");
             System.out.println("3. Display all the doctors");
             System.out.println("4. Update a doctor information");
             System.out.println("5. Delete a doctor");
             System.out.println("6. Exit");
             
             
             System.out.print("Enter your choice: ");
             choice = sc.nextInt();
             sc.nextLine();
             
             switch(choice) {
             
             case 1:
            	 
            	 System.out.println("Enter doctor name :");
            	 String name = sc.next();
            	 
            	 System.out.println("Enter doctor qualification :");
            	 String qualification = sc.next();
            	 
            	 System.out.println("Enter doctor specalization :");
            	 String specalization = sc.next();
            	 
            	 d = new Doctor(name, qualification, specalization);
            	 
            	 System.out.println("Doctor details are adding.........");
            	 dao.saveDoctor(d);
            	 System.out.println("Doctor details are added!");
            	 
             break;
             
             case 2:
            	 List<Doctor> l1 =dao.listDoctor();
            	 
            	 System.out.println("Id\t" +"Name\t" + "Qualification\t" + "Specalization");

            	 Iterator itr = l1.iterator();
            	 while(itr.hasNext()) {
            		 Doctor doc  = (Doctor)itr.next();
            		 System.out.println(doc.getId()+"\t"+doc.getdName()+"\t"+doc.getQualification()+"\t"+doc.getSpecalization());
            	 }
             break;
             
             case 3:
            	 System.out.println("Enter doctor id :");
            	 int id = sc.nextInt();
            	 
            	
            	 Doctor l =dao.listById(id);
            	 System.out.println("Id\t" +"Name\t" + "Qualification\t" + "Specalization");
            	 System.out.println(l.getId()+"\t"+l.getdName()+"\t"+l.getQualification()+"\t"+l.getSpecalization());   	 
             break;
             
             case 4:
            	 
            	System.out.println("Enter the doctor id for update: ");
 	        	int id1 = sc.nextInt();
 	        	
 	        	Doctor update = dao.listById(id1);
 	        	
 	        	
 	        	if(update == null) {
 	        		System.out.println("Sorry! The user does not exit.");
 	        		break;
 	        	}
 	        	
 	        	
 	        	System.out.println("Leave blank if don't want to change.");
 	        	sc.nextLine();
 	        	
 	        	System.out.print("Update the doctor name: ");
 	        	String name1 = sc.nextLine();
 	        	if(name1 != "")
 	        		update.setdName(name1);
 	        	
 	        	System.out.print("Update the doctor qualification: ");
 	        	String qualification1 =  sc.nextLine();
 	        	if(qualification1 != "")
 	        		update.setQualification(qualification1);
 	        	
 	        	
 	        	
 	        	
 	        	System.out.print("Update the doctor specialization: ");
 	        	String specialization1 =  sc.nextLine();
 	        	
 	        	if(specialization1 != "")
 	        		update.setSpecalization(specialization1);
 	        		
 	        	System.out.println("\nUpdating the Doctor.........");
 	        	dao.updateDoctor(update);
 	        	System.out.println("Doctor updated successfully!");
 	        	break;
             
             case 5:
            	 
            	 System.out.println("Enter doctor id :");
            	 int id2 = sc.nextInt();
            	  
            	 System.out.println("Doctor details are deleting.........");
            	 dao.deleteDoctor(id2);
            	 System.out.println("Doctor details are deleted!");
            	 
             break;
             
             case 6:
            	 System.exit(6);  
            	 System.out.println("Thank You!");
             break;
             
             default:
            	 System.out.println("Invalid input please try again!");
             }
			
		}while(choice!=6);

	}

}

package OOPact;

import java.util.Scanner;

public class CollegeList {
	
	static boolean cont;
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		Employee e = new Employee();
		Faculty f = new Faculty();
		Student s = new Student();
		cont = true;
		
		while(cont) {
			
			while(cont) {
				System.out.print("Please select if you are an Employee [E], Faculty [F], or Student [S]: ");
				String choice = sc.nextLine();
				
				if(choice.toUpperCase().charAt(0) == 'E') {
					System.out.println("\n" + "\t EMPLOYEE");
					System.out.println("Enter your name and contact number.");
					System.out.print("Name: ");
					e.setName(sc.nextLine());
					System.out.print("Number: ");
					e.setContactNum(sc.nextLine());
					System.out.print("Enter your monthly salary: ");
					e.setSalary(sc.nextDouble());
					sc.nextLine();
					System.out.print("Enter your department: ");
					e.setDepartment(sc.nextLine());
					
					System.out.println("\n" + "\t*******EMPLOYEE*******");
					System.out.println("\tName: " + e.getName());
					System.out.println("\tContact Number: " + e.getContactNum());
					System.out.println("\tSalary: " + e.getSalary());
					System.out.println("\tDepartment: " + e.getDepartment());
					System.out.println("\t***********************" + "\n");
					break;
				}else if(choice.toUpperCase().charAt(0) == 'F'){
					System.out.println("\n" + "\t FACULTY");
					System.out.println("Enter your name and contact number.");
					System.out.print("Name: ");
					f.setName(sc.nextLine());
					System.out.print("Number: ");
					f.setContactNum(sc.nextLine());
					System.out.print("Press [Y] if you are regular/tenured or [N] if not: ");
					f.setStatus(sc.nextLine());
					System.out.print("Enter your monthly salary: ");
					e.setSalary(sc.nextDouble());
					sc.nextLine();
					System.out.print("Enter your department: ");
					f.setDepartment(sc.nextLine());
					
					System.out.println("\n" + "\t*******FACULTY*******");
					System.out.println("\tName: " + f.getName());
					System.out.println("\tContact Number: " + f.getContactNum());
					System.out.println("\tSalary: " + f.getSalary());
					System.out.println("\tDepartment: " + f.getDepartment());
					System.out.println("\tStatus: " + f.isRegular());
					System.out.println("\t***********************" + "\n");
					break;
				}else if(choice.toUpperCase().charAt(0) == 'S') {
					System.out.println("\n" + "\t STUDENT");
					System.out.println("Enter your name and contact number.");
					System.out.print("Name: ");
					s.setName(sc.nextLine());
					System.out.print("Number: ");
					s.setContactNum(sc.nextLine());
					System.out.print("Enter your program: ");
					s.setProgram(sc.nextLine());
					System.out.print("Enter your year level(1-4): ");
					s.setYearLevel(sc.nextLine());
					
					System.out.println("\n" + "\t*******STUDENT*******");
					System.out.println("\tName: " + s.getName());
					System.out.println("\tContact Number: " + s.getContactNum());
					System.out.println("\tProgram: " + s.getProgram());
					System.out.println("\tYear Level: " + s.getYearLevel());
					System.out.println("\t***********************" + "\n");
					break;
				}else {
					System.err.println("Your input is Wrong! Please try again.");
				}
			 }
			
				while(true) {
				System.out.print("You want to input another? Yes [Y] / No [N]: ");
				String choice1 = sc.next();
				
				if(choice1.toUpperCase().equals("Y")){
					sc.nextLine();
					break;
				}else if(choice1.toUpperCase().equals("N")){
					System.out.println("\n" + "Thank you for using our program! Program will be terminated.");
					cont = false;
					break;
				}else{
					System.err.println("Please try again!");
				}
			}
		 }
	  }
   }
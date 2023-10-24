package OOPactivity;

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
		System.out.print("Please select if you are an Employee [E], Faculty [F], or Student [S]: ");
		String choice = sc.nextLine();
		
		if(choice.toUpperCase().charAt(0) == 'E') {
			System.out.println("Enter your name and contact number.");
			System.out.print("Name: ");
			e.setName(sc.nextLine());
			System.out.print("Number: ");
			e.setContactNum(sc.nextLine());
			System.out.print("Enter your department: ");
			e.setDepartment(sc.nextLine());
			System.out.print("Enter your monthly salary: ");
			e.setSalary(sc.nextDouble());
			
			System.out.println("Name: " + e.getName());
			System.out.println("Contact Number: " + e.getContactNum());
			System.out.println("Salary: " + e.getSalary());
			System.out.println("Department: " + e.getDepartment());
		}else if(choice.toUpperCase().charAt(0) == 'F'){
			System.out.println("Enter your name and contact number.");
			System.out.print("Name: ");
			f.setName(sc.nextLine());
			System.out.print("Number: ");
			f.setContactNum(sc.nextLine());
			System.out.println("Press [Y] if you are regular/tenured or [N] if not: ");
			f.setStatus(sc.nextLine());
			System.out.print("Enter your department: ");
			f.setDepartment(sc.nextLine());
			System.out.print("Enter your monthly salary: ");
			f.setSalary(sc.nextDouble());
			
			System.out.println("Name: " + f.getName());
			System.out.println("Contact Number: " + f.getContactNum());
			System.out.println("Salary: " + f.getSalary());
			System.out.println("Department: " + f.getDepartment());
			System.out.println("Status: " + f.isRegular());
		}else if(choice.toUpperCase().charAt(0) == 'S') {
			System.out.println("Enter your name and contact number.");
			System.out.print("Name: ");
			s.setName(sc.nextLine());
			System.out.print("Number: ");
			s.setContactNum(sc.nextLine());
			System.out.print("Enter your program: ");
			s.setProgram(sc.nextLine());
			System.out.print("Enter your year level(1-4): ");
			s.setYearLevel(sc.nextLine());
			
			System.out.println("Name: " + s.getName());
			System.out.println("Contact Number: " + s.getContactNum());
			System.out.println("Program: " + s.getProgram());
			System.out.println("Year Level: " + s.getYearLevel());
		}else {
			System.err.println("Your input is Wrong! Program is terminated.");
			break;
		}
		
		while(cont) {
		System.out.print("You want to input another? Yes [Y] / No [N]: ");
		String choice1 = sc.next();
		
		if(choice1.toUpperCase() == "Y") {
			break;
		}else if(choice1.toUpperCase() == "N") {
			System.out.println("Thank you for using our program! Program will be terminated.");
			cont = false;
			break;
		}else{
			System.err.println("Please try again!");
		}
		}
	 }
   }
}

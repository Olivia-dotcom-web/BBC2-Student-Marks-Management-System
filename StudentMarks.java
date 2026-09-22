package studentmarkssystem;
import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
		
Scanner input = new Scanner(System.in);
char again = 0;
//Do-while loop:allows the program to run at least once 
do {
System.out.println("STUDENT MARKS MANAGEMENT SYSTEM");
System.out.print("Enter number of students: ");
int numberOfStudents = input.nextInt();

//For loop: processes each student
for(int i= 1; i <= numberOfStudents; i++) {
System.out.print("Enter student name:");
String name = input.next();

System.out.print("Enter marks(0-100):");
int marks = input.nextInt();

//while loop: validates the marks
while(marks <0 || marks >100) {
System.out.println("Invalid marks!");
System.out.print("Please enter marks between 0 and 100: ");
marks = input.nextInt();
}

//Ternary statement:determines PASS OR FAIL
String result = marks >= 50 ? "PASS": "FAIL";

//Determine grade
String grade;
if (marks>=80) {
	grade = "A";
}else if (marks>= 70) {
	grade = "B";
}else if (marks >= 60) {
	grade="C";
}else if (marks >= 50) {
	grade="D";
}else {
	grade = "F";
	}
	
//Display students's results
System.out.println("Name:"+ name);
System.out.println("Marks:"+ marks);
System.out.println("Grade:"+ grade);
System.out.println("Result:"+ result);
}
//Ask user if they want to run the system again
System.out.print("Do you want to process another batch?(Y/N): ");
again=input.next().charAt(0);
}while (again== 'Y' || again=='y');

System.out.println("THANK YOU FOR USING THE SYSTEM!");
input.close();


	}

	}
//MEMBERS THAT PARTICIPATED
//NAKAVUBU OLIVIA 25/U/15402/PS
//NABUBWAMA JEMIMAH JOY 25/U/26885
//NABAGULANYI PROSSY SHERRY 25/U1254
//MUGONYA RONALD  25/U/15257/PS
//MUSUBIKA WINNIE GRACE 25/U/15305/EVE



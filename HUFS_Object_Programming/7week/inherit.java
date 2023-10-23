import java.io.*;
import java.util.*;

class Person{
	public String name;
	protected int age;
	private String note = "None";
	String job;
	
	public void setNote(String note){
		this.note = note;
	}
	
	public String getNote(){
		return note;
	}
}

class Student extends Person{
	public void set(String name, int age){
		this.name = name;
		this.age = age;
		this.job = "Student";
	}
}

class StudentResearcher extends Person {
	public void set(String name, int age, String note){
		this.name = name;
		this.age = age;
		this.job = "Student Researcher";
		setNote(note);
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = 0; int n = scanner.nextInt();
		scanner.nextLine();
		
		Person [] c = new Person[n];
		
		
		while(count < n){
			String line = scanner.nextLine();
			String[] A = line.split(" ");
			
			String name = A[0];
			String job = A[1];
			int age = Integer.parseInt(A[2]);
			
			
			if(job.equals("Student")){
				Student a = new Student();
				a.set(name, age);
				c[count] = a;
				System.out.printf("Name: %s | Job: %s | Age: %d | Note: %s\n",c[count].name, c[count].job, c[count].age, c[count].getNote());
				count += 1;
				
			}
			else if(job.equals("Student_Researcher")){
				String note = A[3];
				StudentResearcher b = new StudentResearcher();
				b.set(name,age,note);
				c[count] = b;
				System.out.printf("Name: %s | Job: %s | Age: %d | Note: %s\n",c[count].name, c[count].job, c[count].age, c[count].getNote());
				count += 1;
			}
			
			else{
				System.out.println("다시 입력해주세요.");
				
			}
		}
	}
}

package tugas;

import java.util.Scanner;

public class Latihan01 {
	static Student student = new Student();
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input: ");
		int age = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println(student.getAge(age));
	}
}

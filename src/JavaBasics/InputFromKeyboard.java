package JavaBasics;

import java.util.Scanner;

public class InputFromKeyboard {

	public static void main(String[] args) {
		
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Please Enter your name");
		 
		String name=scanner.nextLine();
		System.out.println("Please Enter your age");
		
		int age=scanner.nextInt();
		System.out.println("Hi "+name+" you are "+age+" years old");

	}

}

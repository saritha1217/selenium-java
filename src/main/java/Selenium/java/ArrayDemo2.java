package Selenium.java;

import java.util.Scanner;

public class ArrayDemo2 {

	public static void main(String[] args) {
		int arr[]=new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			
			System.out.println("Enter a number to store in array,enter 0 to exit");
			int userNumber=sc.nextInt();
			if(userNumber==0)
				break;
			
			arr[i]=userNumber;
			
		}
		System.out.println("You have entered:");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+", ");
		     System.out.println("this is added for git");

		}

	}



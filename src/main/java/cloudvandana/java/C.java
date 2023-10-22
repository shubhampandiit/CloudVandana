package cloudvandana.java;

import java.util.Scanner;

public class C {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence");
		String s=sc.nextLine();
		boolean isPangram=true;
		for (char ch = 'a'; ch<='z'; ch++) {
			if (s.toLowerCase().indexOf(ch)==-1) {
				isPangram=false;
				break;
			}
		}
		if(isPangram) {
			System.out.println("the sentence is panagram");
		}
		else {
			System.out.print(" the sentence is not panagam");
		}
	}
}

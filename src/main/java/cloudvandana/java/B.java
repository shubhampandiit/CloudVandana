package cloudvandana.java;

import java.util.Scanner;

public class B {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	String rom=sc.nextLine();
	
	int num=0;
	for (int i = 0; i < rom.length(); i++) {
		switch (rom.charAt(i)) {
		case 'I':
		{
			num=num+1;
			break;
		}
		case 'V':
		{
			num=num+5;
			break;
		}
		case 'X':
		{
			num=num+10;
			break;
		}
		case 'L':
		{
			num=num+50;
			break;
		}
		case 'C':
		{
			num=num+100;
			break;
		}
		case 'D':
		{
			num=num+500;
			break;
		}
		case 'M':
		{
			num=num+1000;
			break;
		}

		default:
			break;
		}
		if(i<rom.length()-1) {
			switch (rom.charAt(i)) {
			case 'I':
			{
				if(rom.charAt(i+1)=='V' || rom.charAt(i+1)=='X') {
					num-=2;
				}
				break;
			}
				
			case 'X' :
			{
				if(rom.charAt(i+1)=='L' ||rom.charAt(i+1)=='C')
				{
					num-=20;
				}
				break;
			}
			case 'C':
			{
				if(rom.charAt(i+1)=='L' ||  rom.charAt(i+1)=='M')
				{
					num-=200;
				}
				break;
			}

		
		}
	}
		
}
	System.out.println("Integer value of roman is:"+num);
}
}

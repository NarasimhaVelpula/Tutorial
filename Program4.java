package basics;

import java.util.Scanner;

public class Program4 {
/*  Assignment 5:  Write a program that will accept a 4 digit number(assume that the user enters only 4 digit nos.) 
 * and print the sum of all the 4 digits. For ex : If the number passed is 3629,
 *  the program should print “The sum of all the digits entered is 20” 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a four digit number:");
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0,r;
		while(num!=0)
		{
			r=num%10;
			sum=sum+r;
			num=num/10;
		}
		System.out.println("The sum of all the digits entered is "+sum);
	}

}

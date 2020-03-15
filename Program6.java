package basics;

import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f;
		System.out.println("Enter a input Number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		f=fact(num);
		System.out.println("Factorial of a given Number is: "+f);
	}

	public static int fact(int num) {
		// TODO Auto-generated method stub
		
		if(num==0)
			return 1;
		else
			return num*fact(num-1);
	}

}

package nasim.d.rustam.text;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the FIRST value");
		int n1=sc.nextInt();
		System.out.println("enter the second value");
		int n2=sc.nextInt();
		int max=(n1>n2)?n1:n2;
		while(true)
		{
		if(max%n1==0&& max%n2==0)
		{
			System.out.println(max);
			break;
		}
		max++;
	}
	}

}

package nasim.d.rustam.text;

import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int rem;
		int temp=n;
		while(temp!=0)
		{
			rem=temp%10;
			sum+=rem;
			temp=temp/10;
		}
System.out.println("sum= "+sum);
	}

}

package shopping;

import java.util.Scanner;

public class TestOnline {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Customer c1=new Customer();
		System.out.println("Enter the id");
		int id=sc.nextInt();
		System.out.println("Enter the name:");
		String nm=sc.next();
		System.out.println("Enter the salary:");
		float sal=sc.nextFloat();
		
		c1.setCustID(id);
		c1.setCustName(nm);
		c1.setCustSalary(sal);
		
		System.out.println("\n"+c1.getCustID());
		System.out.println("\n"+c1.getCustName());
		System.out.println("\n"+c1.getCustSalary());
		
	}

}

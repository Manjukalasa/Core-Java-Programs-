package com.java.usertransaction;

import java.util.Scanner;

public class MainBanking    // object Utilization  
{
	public static void main(String[] args) 
	{
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter ATM pin");
		 int atmpin=sc.nextInt();
		 System.out.println("Select Options: Choice 1-Deposit/Receive Amount Or Choice 2-Withdraw/send Amount");
		 int choice=sc.nextInt(); 
		 System.out.println("Enter Amount");
		 Double amt=sc.nextDouble(); 
		 System.out.println("----------------------------------------------------------------------------------");
		 Service s1=new Service();
		 User u1=s1.createobject(atmpin);
		 u1.transfer(choice,amt);
		 sc.close();

	}

}

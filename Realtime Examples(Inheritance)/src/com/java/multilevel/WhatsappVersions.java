package com.java.multilevel;
class WhatsappV1                 // super class
{
	public void sendmsg()  
	{
	System.out.println("Send Msg");
	}
}
class WhatsappV2 extends WhatsappV1     //super class
{
	public void sendvoicemsg()
	{
		System.out.println("Send Voice Msg");
	}
}
	class WhatsappV3 extends WhatsappV2     //sub class
	{
		public void videocall()
		{
			System.out.println("vieo Call");
		}
	}
public class WhatsappVersions
{
	public static void main (String[] args)
	{    
//	     WhatsappV1 w1=new WhatsappV1();
//       w1.sendmsg();
		
//       WhatsappV2 w2=new WhatsappV2();
//       w2.sendmsg();
//       w2.sendvoicemsg();
       
	   WhatsappV3 w3=new WhatsappV3();
       w3.sendmsg();
       w3.sendvoicemsg();
       w3.videocall();
       
      

	}

}

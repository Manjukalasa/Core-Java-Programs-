package com.java.hierachical;
class Android
{
	public void homeicons()
	{
		System.out.println(" 5 apps");
	}
}
class  Samsung extends Android
{
	@Override
	public void homeicons()
	{
		System.out.println("10 apps");
	}
}	
	class  oneplus extends Android
	{
		@Override
		public void homeicons()
		{ 
			super.homeicons();
			System.out.println(" 6 apps");
		}
	}
		class Nokia extends Android
		{
			@Override
			public void homeicons()
			{
				System.out.println("All apps");
			}
}
public class AndroidAppsicons 
{
	public static void main(String[] args) 
	{
		oneplus o2=new oneplus(); 
		o2.homeicons();    // 6
	}
}
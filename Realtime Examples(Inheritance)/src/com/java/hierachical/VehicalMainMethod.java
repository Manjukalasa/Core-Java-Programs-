package com.java.hierachical;

class Vehical1                   // constructor,this Keyword,constructor overloading,inherited classes,Method overriding,
{                                // explicit super statement call with args,object creation using reference variable
 String vehicalno;
 String owner;
 String modelName;
 String BradName;
 String Capacity;
public Vehical1(String vehicalno,String owner,String modelName,String BradName,String Capacity) 
{ 
 this.vehicalno=vehicalno;
 this.owner=owner;
 this.modelName=modelName;
 this.BradName=BradName;
 this.Capacity=Capacity;

}
public Vehical1(String vehicalno,String owner,String modelName,String BradName) 
{
 this.vehicalno=vehicalno;
 this.owner=owner;	
 this.modelName=modelName;
 this.BradName=BradName;
}

public void vehicalNumber()
{
	System.out.println(vehicalno);
}
public void detailsofvehical()
{
	System.out.println(owner);
	System.out.println(modelName);
	System.out.println(BradName);
}
public void Capcity()
{
	System.out.println(Capacity);
}
}
 class Car1 extends Vehical1
{
	String color;
  public Car1( String vehicalno,String owner,String modelName,String BradName,String Capacity,String color) 
  {
	  super(vehicalno,owner,modelName,BradName,Capacity);
	  this.color=color;
  }
  @Override
  public void vehicalNumber()
  {
	  System.out.println("Car:vehicalno-"+vehicalno);
  }
  @Override
  public void detailsofvehical()
  {
	System.out.println("Owner-"+owner);
  	System.out.println("Car:modelName-"+modelName);
  	System.out.println("Car:BradName-"+BradName);
  	System.out.println("Car:color-"+color);
  }
  @Override
  public void Capcity()
  {
  	System.out.println("Car:Capacity-"+Capacity);
  }
}
 class TwoWheeler1 extends Vehical1
 {
	 String color;
   public TwoWheeler1( String vehicalno,String owner,String modelName,String BradName,String Capacity,String color)
   {
 	  super(vehicalno,owner,modelName,BradName,Capacity);
 	  this.color=color;
   }
   public TwoWheeler1(String vehicalno,String owner,String modelName,String BradName,String color)
   {
 	  super(vehicalno,owner,modelName,BradName,color);
 	  this.color=color;
   }
   @Override
   public void vehicalNumber()
   {
 	  System.out.println("TwoWheeler:vehicalno-"+vehicalno);
   }
   @Override
   public void detailsofvehical()
   {
 	System.out.println("Owner-"+owner);
   	System.out.println("TwoWheeler:modelName-"+modelName);
   	System.out.println("TwoWheeler:BradName-"+BradName);
	System.out.println("TwoWheeler:color-"+color);
   }
   @Override
   public void Capcity()
   {
   	System.out.println("TwoWheeler:Capacity-"+Capacity);
   }
 }
public class VehicalMainMethod
{
	public static void main(String []args)
	{
	System.out.println("Two Wheeler Details");
	System.out.println("-------------------------------------------------");
	TwoWheeler1 t1=new TwoWheeler1("KA291616","manju","NS200 2018","pulser","200CC","red");
	t1.vehicalNumber();
	t1.detailsofvehical();
	t1.Capcity();
	System.out.println("------------------------------------------------");
	TwoWheeler1 t2=new TwoWheeler1("KA293030","manju","pulsur150 2019","pulser","Black");
	t2.vehicalNumber();
	t2.detailsofvehical();
	System.out.println("_________________________________________________");
	System.out.println("Car Details");
	System.out.println("------------------------------------------------");
	Car1 c1=new Car1("KA293333","manju","audi 2019","Audi","2000CC","White");
	c1.vehicalNumber();
	c1.detailsofvehical();
	c1.Capcity();
	}
}
package com.java.hibreadinheritance;

class Instgarm
{
	public void upload()
	{
	System.out.println("Upload Processing");
}
}
class UploadPhoto extends Instgarm                        
{         
	public void uploadphot()
	{
		super.upload();
	System.out.println("photo Uploaded successfully");
    }
}
class UploadVideo extends Instgarm                           
{         
	public void uploadvideo()
	{
	super.upload();
	System.out.println("video Uploaded successfully");
    }
}
class Photo extends UploadPhoto
{
	public void selectphoto()
	{
	System.out.println("photo selected");
    }
}
class Video extends UploadVideo           
{
	public void selectvideo()
	{
	System.out.println("video selected");
    }
}
public class Instagram 
{	
	public static void main(String[] args)
	{
	 Photo p=new Photo();
	 p.selectphoto();
	 p.uploadphot();
	 System.out.println("---------------------------");
	 Video v=new Video();
	 v.selectvideo();
	 v.uploadvideo();
	}

}
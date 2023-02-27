package com.automation.world;

public class VolumeMethod {
	
	int height;
	int width;
	int depth;
	
	public void volume() {
		System.out.println("Volume is:"+width*depth*height);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VolumeMethod v=new VolumeMethod();
		v.depth=10;
		v.height=20;
		v.width=30;
		v.volume();
		
		VolumeMethod v1=new VolumeMethod();
		v1.depth=20;
		v1.height=30;
		v1.width=40;
		v1.volume();
		
		
	}

}

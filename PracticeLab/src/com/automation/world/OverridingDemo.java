package com.automation.world;

class Parent {
	
	int i;
	int j;

public Parent(int a,int b){
	this.i=a;
	this.j=b;
}

public void show() {
	System.out.println("The value of i->"+i+" and j is->"+j);
}
}

public class OverridingDemo extends Parent {
	
	int k;
	public OverridingDemo(int i,int j,int c){
		super(i,j);
		this.k=c;
	}
	public void show() {
		super.show();
		System.out.println("The value of k->"+k);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverridingDemo child=new OverridingDemo(10,20,30);
		child.show();
		
		System.out.println("-------------------------");
		
		Parent p=new Parent(10,20);
		p.show();

	}

}

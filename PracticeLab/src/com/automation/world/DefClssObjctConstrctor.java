package com.automation.world;

//We create the class with the name of DefClssObjctConstrctor
public class DefClssObjctConstrctor {
	
	String name;
	
	//Constructor created
	public DefClssObjctConstrctor(String name) {
		this.name=name;
	}
	
	public void display() {
		System.out.println("The name of the Employee is "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating of Object for the given Class
		DefClssObjctConstrctor obj=new DefClssObjctConstrctor("Faraih Islam");
		obj.display();

	}

}

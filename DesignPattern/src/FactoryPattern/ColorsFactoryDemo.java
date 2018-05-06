package FactoryPattern;

import java.util.Scanner;

public class ColorsFactoryDemo {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Which color do you want ? RYB??");
		String color=s.next();
		ColorsFactory cf=new ColorsFactory();
		Colors c= cf.getColor(color);
		try{
		c.show();
		}
		catch (NullPointerException e) {
			System.out.println(" PLease choose among red yelow and blue");
		}
	}

}

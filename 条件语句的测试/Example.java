package test;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
	   Scanner reader=new Scanner(System.in);
	   int a=reader.nextInt();
       Select select=new Select();
       System.out.println(select.getLevel(a));
	}

}

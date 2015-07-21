package year;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
          Scanner reader=new Scanner(System.in);
          int a=reader.nextInt();
          judge judgeone=new judge();
          System.out.println(judgeone.isLeap(a));
	}

}

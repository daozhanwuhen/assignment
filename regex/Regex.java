package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {
	 String []strArray=new String[20];
     System.out.println("向字符串数组中输入任意字符串，输入0000结束操作");
     Scanner reader=new Scanner(System.in);
     String str=reader.nextLine();
     int times = 1;
     while(str!="0000"){
    	 strArray[times]=str;
    	 if(isStr(str)){
    		 System.out.println("合法字符串");
    	 }
    	 else{
    		 System.out.println("不合法字符串");
    	 }
    	 times = times + 1;
			str =reader.nextLine();
     }
     
	}

	 static boolean isStr(String str) {
		 Pattern pattern = Pattern.compile("[a-z]+[0-9]+[A-Z]+");
		 Matcher m = pattern.matcher(str);
		 return m.matches();
	}
}

package expression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {

	public static void main(String[] args) {
        System.out.println("�������ַ���");
        Scanner reader=new Scanner(System.in);
        String email=reader.nextLine();
        if(ismail(email)){
			System.out.println("�Ϸ�����");
		}
		else{
			System.out.println("���Ϸ�����");
		}
	}

	private static boolean ismail(String n) {
		Pattern pattern = Pattern.compile("\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*");
		Matcher m = pattern.matcher(n);
		return m.matches();
	}

}

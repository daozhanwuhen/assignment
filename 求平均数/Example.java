package average;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
         System.out.println("���������ɳɼ���ÿ����һ�����س�ȷ��");
         System.out.println("�����������0�����������");
         Scanner reader=new Scanner(System.in);
         double sum=0;
         int m=0;
         double x=reader.nextDouble();
         while(x != 0){
        	 m=m+1;
        	 sum=sum+x;
        	 x=reader.nextDouble();
         }
         System.out.println(m+"�����ĺ�Ϊ"+sum);
         System.out.println(m+"������ƽ��ֵ"+sum/m);
	}
}

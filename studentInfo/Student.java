package studentInfo;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		String name;
		int grade;
		String major;
		int[] cet4_scores=new int [10];

		/*void level_up(){}
        if (passed_cet4())
		{
			System.out.println("�ļ���ͨ��");
		}
		else
		{
			System.out.println("�ļ�δͨ��");
		}
        void printInfo(){}
	    boolean passed_cet4(int i){}*/
		System.out.println("�����������������ļ��ɼ�������0��������");
	    Scanner read=new Scanner(System.in);
	    int times=0;
	    int x=read.nextInt();
	    /*cet4_scores[m]=read.nextInt();*/
	    while(x!=0)
	    {
	    	times=times+1;
	    	/*cet4_scores[times-1]=read.nextInt();*/
	    	if(x>425){
	    		System.out.println("�ļ��ѹ�");break;
	    	}
	    	else{
	    		System.out.println("�ļ�û��������Ŭ��");
	    	}
	    	x=read.nextInt();
	    }
	    System.out.println("ϵͳ��ӡ�����ļ��ɼ��Ĵ���"+times);
	    /*for( int i=0;i<times;i++){
	    	cet4_scores[i]=read.nextInt();
	    	System.out.println(cet4_scores[i]);
	    }*/
	}
}

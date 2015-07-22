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
			System.out.println("四级已通过");
		}
		else
		{
			System.out.println("四级未通过");
		}
        void printInfo(){}
	    boolean passed_cet4(int i){}*/
		System.out.println("向整型数组中输入四级成绩，输入0结束操作");
	    Scanner read=new Scanner(System.in);
	    int times=0;
	    int x=read.nextInt();
	    /*cet4_scores[m]=read.nextInt();*/
	    while(x!=0)
	    {
	    	times=times+1;
	    	/*cet4_scores[times-1]=read.nextInt();*/
	    	if(x>425){
	    		System.out.println("四级已过");break;
	    	}
	    	else{
	    		System.out.println("四级没过，继续努力");
	    	}
	    	x=read.nextInt();
	    }
	    System.out.println("系统打印输入四级成绩的次数"+times);
	    /*for( int i=0;i<times;i++){
	    	cet4_scores[i]=read.nextInt();
	    	System.out.println(cet4_scores[i]);
	    }*/
	}
}

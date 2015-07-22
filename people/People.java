package people;

public class People {
	 int age;               //private的成员变量能否被继承？
     String name;
     float height;
     void setAttribute(int _age,String _name,float _height){
   	 age=_age;
   	 name=_name;
   	 height=_height;
    }
     public int getAge(){
    	 return age;
     }
     public String getName(){
    	 return name;
     }
     public float getHeight(){
    	 return height;
     }
}

package test;

public class Select {
     String getLevel(int age){
    	if(0<age && age<3){
    		return("婴儿");
    	}
    		else if(3<=age && age<15){
    			return("少年");
    		}
    		else if(15<=age && age<30){
    			return("青年");
    		}
    		else if(30<=age && age<55){
    			return("中年");
    		}
    		else{
    			return("老年");
    		}
    		}
    	}

package coreJava_Class;

public class Count {

	public static void main(String[] args) {
		 String str = "Welcome to Javatpoint portal";  
	        int count = 0;  
	        for (int i=0; i<=str.length()-1; i++) {  
	            if(str.charAt(i) == 'e') {  
	                count++;  
	            }  
	        }  
	        System.out.println("Frequency of t is: "+count);  
	    }  

	}


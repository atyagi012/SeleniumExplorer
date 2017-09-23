package java_test;

import java.util.ArrayList;
import java.util.List;

public class TestList {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> listStrings = new ArrayList<String>();
		listStrings.add("One");
		listStrings.add("Two");

		System.out.println(listStrings);
		
		//Substring
		/*String str = "Hello world!";
		String res = str.substring(4);
		System.out.println(res);*/
		
		//Split
		/*String str1 = new String("28/12/2013");

		 System.out.println("split(String regex):");
		 String array1[]= str1.split("/");
	       for (String temp: array1){
	          System.out.println(temp);
	       }*/
	       List<String> str3= new ArrayList<String>();
	       str3.add("Apple");
	       str3.add("orange");
	       List<String> str4=new ArrayList<String>();
	       str3.addAll(str4);
	       for(String asd : str4){
	    	   System.out.println(asd);
	       }
	       
	       
	}

}

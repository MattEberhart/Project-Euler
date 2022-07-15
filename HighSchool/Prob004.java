package HighSchool;

import java.util.ArrayList;


public class Prob004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tempString;
		int factor1 = 999;
		int factor2 = 999;
		int tempInt;
		int length;
		int greatest;
		String backHalf;


		ArrayList<Integer> palindromeArray = new ArrayList<Integer>();

		for(factor1=999; factor1>99; factor1--)
		{
		     for(factor2=999; factor2>100; factor2--)
		     {
		    	 tempInt=factor1*factor2;
		    	 tempString="" + tempInt;
		    	 length = tempString.length();
		    	 backHalf=tempString.substring(length-1);
		    	 if(length%2==0)
		    	 {
		    		 for(int e = 2; e<=(length/2); e++)
		    		 {
		    			 backHalf = backHalf + tempString.substring((length-e), (length-(e -1)));
		    		 }
		    		 if(tempString.substring(0, length/2).equals(backHalf))
		    		 {
		    			 palindromeArray.add(tempInt);
		    		 }
		    	 }
		    	 
		     }
		}
		greatest = palindromeArray.get(0);

		for(int d = 1; d<palindromeArray.size(); d++)
		{
		if(palindromeArray.get(d)>greatest)
		greatest=palindromeArray.get(d);
		}

		System.out.println(greatest);




	}

}

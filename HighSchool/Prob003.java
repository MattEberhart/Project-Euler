package HighSchool;

import java.util.ArrayList;


public class Prob003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Long> array = new ArrayList<Long>();
		Long product = 600851475143L;
		Long half = (product/2);
		if(half%2==0)
			half-=1;


		for(long x = 3; x<=half; x+=2)    //finds factors
		{
			if(product%x==0)
				array.add(x);
			
		}

		for(int x = (array.size()-1); x>=0; x--)   //loop to run array backwards
		{
		 for(long y = 2; y<(array.get(x)/2); y++)  //loop that checks array contents for primes  FIX THIS LOOP FOR EFFICIENCY
		 {
			 if(array.get(x)%y==0)   //removes non primes
				 {
				 array.remove(array.get(x));
				 break;
				 }
		 }
		}
		System.out.println(array.get(array.size()-1));   //prints last num in array. should be greatest prime factor

	}

}

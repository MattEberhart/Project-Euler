package HighSchool;

import java.util.*;
public class Prob012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
long answer=0;
long triangle = 0;
ArrayList<Long> array = new ArrayList<Long>();




	for(long x = 1; x>0; x++)//runs as long as we dont have an answer
	{
		triangle = triangle+x;

		for(long z = 1; z<=triangle/2; z++)//gets triangle factors
		{
			if(triangle%z==0)
				array.add(z);
		}
		System.out.println(triangle + " " + array.size());
		if(array.size()>500)
			{
			answer=triangle;
			break;
			}
		else
		{
			
			//array=new ArrayList<Integer>();
			array.clear();
		}
		
	}

System.out.println(answer);
	}

}

package HighSchool;

import java.util.*;
public class Prob023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Long> abundants = new ArrayList<Long>();
Scanner scan = new Scanner(System.in);
long store = 0;
long answer = 0;
for(long x = 12; x<=28124; x++) // determines abundants
{
	for(int y = 1; y<x; y++)
	{
		if(x%y==0)
			store+=y;
	}
	if(store>x)
		abundants.add(x);
	
	store=0;
}

System.out.println(abundants.size());
for(int x = 1; x<=28124; x++)
{
	answer+=x;
}
System.out.println(answer);
long checker=0;
for(int x =24; x<=28124; x++)
{
	for(int y = 0; y<abundants.size(); y++)
	{
		for(int z=0; z<abundants.size(); z++)
		{
			checker=answer;
			store = abundants.get(y) + abundants.get(z);
			if(store>x)
				break;
			if(store==x)
				{
				answer-=x;
				break;
				}

		}
		if(checker>answer)
			break;
	}
	System.out.println(x);
}

/*for(int x = 0; x<abundants.size(); x++)
{
	answer+= abundants.get(x);
}*/

System.out.println(answer);

	}

}

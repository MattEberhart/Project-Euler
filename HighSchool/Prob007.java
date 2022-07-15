package HighSchool;

import java.util.ArrayList;


public class Prob007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Long> array = new ArrayList<Long>();
		ArrayList<Long> tester = new ArrayList<Long>();
		int count = 0;
		for(long g = 3; g<10; g++)
		{
			tester.add(g);
		}
		
for(long x = 1; x>0; x+=2)
{
	System.out.println(count);
	if(array.size()==10001)
		{
		System.out.println(array.get(array.size() - 1));
		break;
		}
	
array.add(x);
if(x>10)
{
	tester.add(x);
}

count++;

for(int y =0; y<tester.size(); y++)
{
	if(tester.get(y)!=x)
	{
if(x%tester.get(y)==0)
{
	array.remove(array.size()-1);
	tester.remove(tester.size()-1);
	count--;
	break;
}
	}

}
}
	}

}

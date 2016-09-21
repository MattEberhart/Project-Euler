import java.util.*;
public class Prob021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> test1 = new ArrayList<Integer>();
		ArrayList<Integer> test2 = new ArrayList<Integer>();
		int store=0;
		int store2=0;
		long answer = 0;
		
for(int x = 1; x<10000; x++)
{
	for(int y =1; y<x; y++)
	{
		if(x%y==0)
		{
		store+=y;
		}
	}
	for(int z = 1; z<store; z++)
	{
		if(store%z==0)
		{
			store2+=z;
		}
	}
	if(store2==x && store!=x)
		{
		answer+=x;
		}
	store=0;
	store2=0;
	
		
}

System.out.println(answer);
	}

}

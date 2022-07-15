package HighSchool;

import java.math.BigInteger;


public class Prob002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1;
		int y = 2;
		BigInteger answer = new BigInteger("0");
		int tempSum;
		int count = 2;

		while(x<=4000000 && y<4000000)
		{
			if(x<y)
			{
				tempSum = x + y;
				x = tempSum;
				count++;
			}
			if(y<x)
			{
				tempSum=x+y;
				y = tempSum;
				count++;
			}
		}

		int array[] = new int[count];
		array[0] = 1;
		array[1] = 2;
		for(int a = 2; a<count; a++)
		{
			array[a] = array[a-2] + array[a-1];
		}
		for(int b = 0; b<count; b++)
		{
			if(array[b]%2==0)
			{
				answer = answer.add(BigInteger.valueOf(array[b]));
			}
		}
		System.out.println(answer);

	}

}

package HighSchool;

import java.math.BigInteger;
import java.util.*;
public class Prob028 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> array = new ArrayList<Integer>();
array.add(1);
int temp=1;
int count = 1;
int counter=0;
BigInteger answer = BigInteger.valueOf(0);
for(int x = 2; x<1001; x+=2)
{
	for(int y = 0; y<4; y++)
	{
		temp+=x;
		array.add(temp);
	}
}


for(int p = 0; p<array.size(); p++)
{
	answer = answer.add(BigInteger.valueOf(array.get(p)));
}
System.out.println(answer);
System.out.println(counter);
	}

}

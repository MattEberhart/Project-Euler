package HighSchool;

import java.math.BigInteger;
import java.util.*;
public class Prob029 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Double> array = new ArrayList<Double>();
int count = 0;
for(long x =2; x<101; x++)
{
	for(long y = 2; y<101; y++)
	{
	array.add(Math.pow(x, y));
	}

}
double[] array2 = new double[array.size()];

for(int p = 0; p<array.size(); p++)
	array2[p]=array.get(p);

Arrays.sort(array2);

for(int i = 0; i<array2.length-1; i++)
{
	if(array2[i]==array2[i+1])
		array2[i]=0;
}

for(int t = 0; t<array2.length; t++)
{
	if(array2[t]!=0)
		count++;
		
}
System.out.println(array2.length);
System.out.println(count);
	

	}
}

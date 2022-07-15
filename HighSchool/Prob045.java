package HighSchool;

import java.util.*;
import java.math.*;
public class Prob045 {


	public static void main(String[] args) {
		ArrayList<BigInteger> tri = new ArrayList<BigInteger>();
		ArrayList<BigInteger> pent = new ArrayList<BigInteger>();
		ArrayList<BigInteger> hex = new ArrayList<BigInteger>();
		
		BigInteger one = new BigInteger("1");
		BigInteger two = new BigInteger("2");
		BigInteger three = new BigInteger("3");
		// TODO Auto-generated method stub
for(int x = 1; x<100000; x++)
{
	BigInteger n = new BigInteger("" + x);
	
	BigInteger tempTri = new BigInteger("0");
	BigInteger tempPent = new BigInteger("0");
	BigInteger tempHex = new BigInteger("0");
	
	tempTri = n.multiply(n.add(one));
	tempTri = tempTri.divide(two);
	
	tempPent = n.multiply((n.multiply(three).subtract(one)));
	tempPent=tempPent.divide(two);
	
	tempHex = n.multiply((n.multiply(two).subtract(one)));
	
	tri.add(tempTri);
	pent.add(tempPent);
	hex.add(tempHex);
}

for(int x=0; x<tri.size(); x++)
{
	BigInteger temp = tri.get(x);
if(pent.contains(temp)&&hex.contains(temp))
	{
	System.out.println(temp);
	System.out.println(x);
	}
}

System.out.println("done");
	}

}

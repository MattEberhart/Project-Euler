package HighSchool;

import java.util.*;
import java.math.BigInteger;
public class Prob013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String temp1, temp2;
//BigInteger int1, int2;
Scanner scan = new Scanner(System.in);
BigInteger total = BigInteger.valueOf(0);
for(int x =0; x<50; x++)
{
	 temp1= scan.next();
	 //int1 = BigInteger.valueOf(Long.parseLong(temp1));
	 BigInteger int1 = new BigInteger(temp1);
	 temp2=scan.next();
	 //int2=BigInteger.valueOf(Long.parseLong(temp2));
	 BigInteger int2 = new BigInteger(temp2);
	 total = total.add(int1);
	 total = total.add(int2);
	 
}
String answer = "" + total;
answer = answer.substring(0, 10);
System.out.println(answer);
	}

}

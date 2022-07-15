package HighSchool;

import java.math.BigInteger;
public class Prob016 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger y = BigInteger.valueOf(2);
		long answer = 0;
y = y.pow(1000);
System.out.println(y);
String product = "" + y;

for(int x=0; x<product.length()-1; x+=2)
{
	String a = product.substring(x, x+1);
	String b = product.substring(x+1, x+2);
	int i = Integer.parseInt(a);
	int j = Integer.parseInt(b);
	answer+=i;
	answer+=j;
}
System.out.println(answer);
	}

}

import java.math.BigInteger;
public class Prob034 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BigInteger factorialSum = new BigInteger("0");
BigInteger answer = new BigInteger("0");
String str;
int digit;
int factorial;
for(int x = 3; x<100000; x++)
{
	str = "" + x;
	for(int y = 0; y<str.length(); y++)
	{
		digit = Integer.parseInt(str.substring(y, y+1));
		factorial = EulerTricks.factorial(digit);
		factorialSum = factorialSum.add(BigInteger.valueOf(factorial));
		if(factorialSum.compareTo(BigInteger.valueOf(x))==1)
		{
			factorialSum = BigInteger.valueOf(0);
			break;
		}
	}

	if(factorialSum.equals(BigInteger.valueOf(x)))
	{
		answer = answer.add(factorialSum);
	}

	System.out.print(answer + "      ");
	System.out.println(x);
	factorialSum=BigInteger.valueOf(0);
	
}
System.out.println(answer);
	}

}

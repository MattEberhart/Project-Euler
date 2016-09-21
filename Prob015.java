import java.math.BigInteger;
public class Prob015 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BigInteger top = new BigInteger("1");
BigInteger bottom1 = new BigInteger("1");
BigInteger bottom2 = new BigInteger("1");

for(int x = 1; x<41; x++)
{
	top = top.multiply(BigInteger.valueOf(x));
}
for(int x=1; x<21; x++)
{
	bottom1 = bottom1.multiply(BigInteger.valueOf(x));
}
for(int x = 1; x<21; x++)
{
	bottom2 = bottom2.multiply(BigInteger.valueOf(x));
}
BigInteger bottom3 = bottom1.multiply(bottom2);
BigInteger answer = top.divide(bottom3);
System.out.println(answer);
	}

}

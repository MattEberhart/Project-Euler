import java.math.BigInteger;
public class Prob020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BigInteger factorial = new BigInteger("1");
int answer=0;
for(int x = 1; x<101; x++)
{
	factorial = factorial.multiply(BigInteger.valueOf(x));
}
String a = factorial.toString();
for(int x = 0; x<a.length(); x++)
{
	answer+= Integer.parseInt(a.substring(x, x+1));
}
System.out.println(answer);
	}

}

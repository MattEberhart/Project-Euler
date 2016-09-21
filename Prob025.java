import java.math.BigInteger;
import java.util.*;
public class Prob025 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int answer = 0;
int abc = 1;
ArrayList<BigInteger> array = new ArrayList<BigInteger>();
array.add(BigInteger.valueOf(0));
array.add(BigInteger.valueOf(1));

while(abc>0)
{
 BigInteger temp = array.get(array.size()-1);
 BigInteger temp2 = array.get(array.size()-2);
 array.add(temp.add(temp2));
 String temp3 = "" + array.get(array.size()-1);
 if(temp3.length()==1000)
	 {
	 abc=-1;
	 }
 System.out.println("" + temp3.length());
}
System.out.println("Answer is " + array.get(array.size()-1));
answer = array.size()-1;
System.out.println("Actually answer is " + answer);
	}

}

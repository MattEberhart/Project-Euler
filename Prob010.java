import java.math.BigInteger;
import java.util.ArrayList;


public class Prob010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger twoBill = new BigInteger("2000000");
		ArrayList<BigInteger> array = new ArrayList<BigInteger>();
		ArrayList<BigInteger> test = new ArrayList<BigInteger>();
		BigInteger loop = new BigInteger("1");
		BigInteger answer = new BigInteger("0");
		BigInteger count = BigInteger.valueOf(0);
		for(int x = 3; x<10; x++)
		{
			test.add(BigInteger.valueOf(x));
		}
		array.add(BigInteger.valueOf(0));
		
		for(loop = BigInteger.valueOf(1); loop.compareTo(twoBill)==(-1); loop = loop.add(BigInteger.valueOf(2)))
		{
			System.out.println(count + " " + array.get(array.size()-1));
			array.add(loop);
			count = count.add(BigInteger.valueOf(1));
			if(loop.compareTo(BigInteger.valueOf(10))==1)
				test.add(loop);
			
			for(Long t = 0L; t<test.size(); t++)
			{
				if(!test.get(t.intValue()).equals(loop) && loop.remainder(test.get(t.intValue())).compareTo(BigInteger.valueOf(0))<1)
				{
					//if(loop.remainder(test.get(t.intValue())).compareTo(BigInteger.valueOf(0))<1)
					//{
						
						
						array.remove(array.size() -1);
						test.remove(test.size()-1);
						count  = count.subtract(BigInteger.valueOf(1));
						break;
						
					//}
					
				}
					
			}
		}
		
		for(Long u = 0L; u<array.size(); u++)
		{
			answer = answer.add(array.get(u.intValue()));
		}
		
		System.out.println(answer);
	}

}

import java.util.*;
public class Prob035 extends EulerTricks {

public static ArrayList rotations(int x)
{
	ArrayList<Integer> nums = new ArrayList<Integer>();
	if(x<10){
		nums.add(x);
		return nums;
	}
	int tempNum=x;
	String temp = tempNum + "";
	for(int y = 0; y<temp.length(); y++){
		nums.add(tempNum);
		temp = temp.substring(1) + temp.substring(0, 1);
		tempNum=Integer.parseInt(temp);
	}
	return nums;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> abc = new ArrayList<Integer>();
int count = 13;
for(int a = 100; a<1000000; a++)
{	boolean tempBool=true;
	abc = rotations(a);
	for(int b = 0; b<abc.size(); b++)
	{
		if(!isPrime(abc.get(b)))
			tempBool=false;
		
	}
	if(tempBool)
		count++;
	
	
}
System.out.println(count);
	}

}

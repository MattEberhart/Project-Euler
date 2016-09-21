
public class Prob006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int squareSum=0;
		int sumSquare=0;
		int sum = 0;

		for(int x = 0; x<=100; x++)
		{
			squareSum+=(x*x);
		}

		for(int x = 0; x<=100; x++)
		{
			sum += x;
		}
		sumSquare = sum*sum;
		int answer = sumSquare-squareSum;
		System.out.println(answer);
	}

}

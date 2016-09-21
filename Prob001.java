
public class Prob001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer= 0;
		for(int x = 0; x<1000; x++)
		{
			if(x%3==0 || x%5==0)
				answer+=x;
		}
			System.out.println(answer);
			
	}

}

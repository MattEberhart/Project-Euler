;


public class Prob009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, a2, b, b2, c, c2;
		int answer=0;


		for(int x =3; x<1000; x++)
		{
			for(int y =4; y<1000; y++)
			{
				for(int z = 5; z<1000; z++ )
				{
					a=x;
					b=y;
					c=z;
					a2 = x*x;
					b2=y*y;
					c2=z*z;
				    if(a2+b2==c2 && a+b+c==1000)
				    {
		answer = a*b*c;
				    	
				    }
				}
			}
		}

		System.out.println(answer);
	}

}

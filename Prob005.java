
public class Prob005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int x = 2520; x>0; x+=20)
		{
			if(x%3==0 && x%5==0 && x%6==0 && x%7==0 && x%8==0 && x%9==0 && x%11==0 && x%12==0 && x%13==0 && x%14==0 && x%15==0 && x%16==0 && x%17==0 && x%18==0 && x%19==0)
			{
				System.out.println(x);
				break;
			}
		}
	}

}

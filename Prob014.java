
public class Prob014 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
long tempcount=0;
long count=0;
long answer=0;

for(long x = 1; x<1000000; x++)
{
    long y = x;
	while(y!=1)
	{
    if(y%2==0)
	{
		y=y/2;
		tempcount++;
	}
	else
	{
		y=(3*y)+1;
		tempcount++;
	}
	}
	if(tempcount>count)
	{
	count=tempcount;
	answer=x;
	}
	tempcount=0;
	System.out.println(x);
}
System.out.println(answer);
	}

}

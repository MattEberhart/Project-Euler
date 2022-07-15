package HighSchool;

public class Prob030 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int max = (int)Math.pow(9, 5);
max*=6;
String num;
String letter;
int letter2;
int tempSum=0;
int answer=0;
for(int x = 10; x<max; x++)
{
num="" + x;
	for(int y = 0; y<num.length(); y++)
	{
	letter=num.substring(y, y+1);
	letter2=Integer.parseInt(letter);
	tempSum+=Math.pow(letter2, 5);
	}
	
	if(tempSum==Integer.parseInt(num))
		answer+=Integer.parseInt(num);
	
	tempSum=0;
}
System.out.println(answer);
	}

}

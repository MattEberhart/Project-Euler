package HighSchool;

public class Prob017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String ones, tens, hundreds;
int ones1=0, tens1=0, hundreds1=0;
long answer =11; //accounts for 1000
for(int x = 1; x<1000; x++)
{
	String num = "" + x;

	if(num.length()==3)
	{
		ones = num.substring(2,3);
		tens=num.substring(1, 2);
		hundreds = num.substring(0, 1);
		ones1=Integer.parseInt(ones);
		tens1=Integer.parseInt(tens);
		hundreds1 = Integer.parseInt(hundreds);
	}
	else if(num.length()==2)
	{
		ones = num.substring(1,2);
		tens=num.substring(0,1);
		ones1=Integer.parseInt(ones);
		tens1=Integer.parseInt(tens);
	}
	else
	{
		ones1=Integer.parseInt(num);	
	}
	
	switch(ones1)
	{
	case 0: answer+=0; break;
	case 1: answer+=3; break;
	case 2: answer+=3; break;
	case 3: answer+=5; break;
	case 4: answer+=4; break;
	case 5: answer+=4; break;
	case 6: answer+=3; break;
	case 7: answer+=5; break;
	case 8: answer+=5; break;
	case 9: answer+=4; break;
	//default: answer+=0;
	}
	
	switch(tens1)
	{
	case 1: switch(ones1)
		{
		case 0: answer+=3; break;
		case 1: answer+=3; break;
		case 2: answer+=3; break;
		case 3: answer+=3; break;
		case 4: answer+=4; break;
		case 5: answer+=3; break;
		case 6: answer+=4; break;
		case 7: answer+=4; break;
		case 8: answer+=3; break;
		case 9: answer+=4; break;
		//default: answer+=0; break;
		}break;
	case 2: answer+=6; break;
	case 3: answer+=6; break;
	case 4: answer+=5; break;
	case 5: answer+=5; break;
	case 6: answer+=5; break;
	case 7: answer+=7; break;
	case 8: answer+=6; break;
	case 9: answer+=6; break;
	default: answer+=0; break;
	}
	
	switch(hundreds1)
	{
	case 1: answer+=13; break;
	case 2: answer+=13; break;
	case 3: answer+=15; break;
	case 4: answer+=14; break;
	case 5: answer+=14; break;
	case 6: answer+=13; break;
	case 7: answer+=15; break;
	case 8: answer+=15; break;
	case 9: answer+=14; break;
	default: answer+=0; break;
	}
	

	
	
}
int subtract = 3*9; //accounts for flat hundreds
answer-=subtract;
System.out.println(answer);

	}

}

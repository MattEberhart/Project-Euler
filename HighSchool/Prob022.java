package HighSchool;

import java.math.BigInteger;
import java.util.*;
public class Prob022 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner scan = new Scanner (System.in);
BigInteger answer = BigInteger.valueOf(0);
ArrayList<String> array2 = new ArrayList<String>();

System.out.println("Enter names");
String dang = scan.nextLine();
while(dang.length()!=8)
{
	String temp2 = dang.substring(dang.indexOf('"')+1, dang.indexOf(',')-1);
	array2.add(temp2);
	dang = dang.substring(dang.indexOf(',')+1);
	
	if(dang.length()==8)
	{
		temp2=dang.substring(1, 7);
		array2.add(temp2);
	}
	/*count3++;
	System.out.println(count3);*/
	
}
System.out.println();

int count = 1;
int temp1 = 0;
int tempTotal = 0;
int tempAnswer = 0;
String[] array = new String[array2.size()];

for(int c = 0; c<array2.size(); c++)
{
	array[c]=array2.get(c);
}

for(int n =0; n<array2.size(); n++)
{
System.out.print(array[n]);
System.out.print(" ");
}

Arrays.sort(array);


for(int y = 0; y<array2.size(); y++)
{
	array[y].toUpperCase();
	for(int z = 0; z<array[y].length(); z++)
	{
		char letter = array[y].charAt(z);
		switch(letter)
		{
		case 'A': temp1=1; break;
		case 'B': temp1=2; break;
		case 'C': temp1=3; break;
		case 'D': temp1=4; break;
		case 'E': temp1=5; break;
		case 'F': temp1=6; break;
		case 'G': temp1=7; break;
		case 'H': temp1=8; break;
		case 'I': temp1=9; break;
		case 'J': temp1=10; break;
		case 'K': temp1=11; break;
		case 'L': temp1=12; break;
		case 'M': temp1=13; break;
		case 'N': temp1=14; break;
		case 'O': temp1=15; break;
		case 'P': temp1=16; break;
		case 'Q': temp1=17; break;
		case 'R': temp1=18; break;
		case 'S': temp1=19; break;
		case 'T': temp1=20; break;
		case 'U': temp1=21; break;
		case 'V': temp1=22; break;
		case 'W': temp1=23; break;
		case 'X': temp1=24; break;
		case 'Y': temp1=25; break;
		case 'Z': temp1=26; break;
		}
		tempTotal+=temp1;
	}
	tempAnswer = tempTotal*count;
	answer = answer.add(BigInteger.valueOf(tempAnswer));
	tempAnswer = 0;
	tempTotal=0;
	temp1=0;
	System.out.println(count);
	count++;
}

System.out.println("" + answer);
	}

}

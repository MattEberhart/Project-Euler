package HighSchool;

import java.util.*;
public class Prob019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int year=1901;

int jan=31, feb=28, mar=31, apr=30, may=31, jun=30, jul=31, aug=31, sep=30, oct=31, nov=30, dec=31;
int[] array = new int[12];
array[0]=jan; array[1]=feb; array[2]=mar; array[3]=apr; array[4]=may; array[5]=jun;
array[6]=jul; array[7]=aug; array[8]=sep; array[9]=oct; array[10]=nov; array[11]=dec;
int days=365;

int[] firsts = new int[12];
firsts[0]=1;
int[] week = new int[7]; week[0]=1; week[1]=2; week[2]=3; week[3]=4;
week[4]=5; week[5]=6; week[6]=7;
int count = 0;



int day=6;
int leftOver=0;
for(year=1901; year<2001; year++)//counts years
{
	switch(leftOver)
	{
	case 1: day=7; break;
	case 2: day=6; break;
	case 3: day=5; break;
	case 4: day=4; break;
	case 5: day=3; break;
	case 6: day=2; break;
	case 7: day=1; break;
	}
	feb=28; days=365; array[1]=feb;
	if(year%4==0 && year!=2000)//checks for leap
	{
	feb = 29;
	days=366;
	array[1]=feb;
	}

	for(int x =1; x<12; x++)
	{
		firsts[x]=firsts[x-1]+array[x-1];
	}
 
	for(day=day; day<=days; day+=7)
	{
		for(int x =0; x<12; x++)
		{
			if(day==firsts[x])
				count++;
		}
	}

	leftOver=day-days;
	System.out.println(leftOver + " " + days + " " + day);
}
System.out.println(count);
	}

}

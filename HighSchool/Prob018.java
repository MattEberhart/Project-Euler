package HighSchool;

import java.util.*;
public class Prob018 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// TODO Auto-generated method stub
		int[][] arr = new int[15][15];
int line = 0;
for(int y = 0; y<15; y++)
{
		for(int x = 0; x<line+1; x++)
		{
			arr[line][x]=scan.nextInt();
		}
		line = y+1;
}
	
for(int x = 0; x<15; x++){
	for(int y = 0; y<15; y++)
	{
		System.out.print(arr[x][y]+ "  ");
	}
System.out.println();
}

for(int y = 13; y>-1;y--)
{
	for(int x = 0; x<=y; x++)
	{
		if(arr[y+1][x]<arr[y+1][x+1])
			arr[y][x]+=arr[y+1][x+1];
			else
				arr[y][x]+=arr[y+1][x];
	}
}
System.out.println(arr[0][0]);







}
}

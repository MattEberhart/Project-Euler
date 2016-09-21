import java.util.*;
public class Prob011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][] array = new int[20][20];
Scanner scan = new Scanner(System.in);
int greatestAccross = 0;
int temp = 0;
int greatestDown=0;
int greatestDiagD = 0;
int greatestDiagU=0;
int abc;
int def;

for(int y =0; y<20; y++)
{
	for(int x = 0; x<20; x++)
	{
		System.out.println("Begin entering data");
		String abcde = scan.next();
	    array[x][y] = Integer.parseInt(abcde);
	    
	}
}

System.out.println("Done");
for(int y=0; y<20; y++)
{
	for(int x = 0; x<17; x++)
	{
		temp = array[x][y]*array[x+1][y]*array[x+2][y]*array[x+3][y];
		if(temp>greatestAccross)
			greatestAccross=temp;
			
	}
}

for(int x=0; x<20; x++)
{
	for(int y = 0; y<17; y++)
	{
		temp = array[x][y]*array[x][y+1]*array[x][y+2]*array[x][y+3];
		if(temp>greatestAccross)
			greatestDown=temp;
			
	}
}

for(int y = 0; y<17; y++)
{
	for(int x = 0; x<17; x++)
	{
		temp= array[x][y]*array[x+1][y+1]*array[x+2][y+2]*array[x+3][y+3];
		if(temp>greatestDiagD)
			greatestDiagD=temp;	
	}
}

for(int x = 19; x>2; x--)
{
	for(int y = 0; y<17; y++)
	{
		temp = array[x][y]*array[x-1][y+1]*array[x-2][y+2]*array[x-3][y+3];
		if(temp>greatestDiagU)
			greatestDiagU=temp;
	}
}

if(greatestDown>greatestAccross)
	abc=greatestDown;
else
	abc=greatestAccross;

if(greatestDiagD>greatestDiagU)
	def=greatestDiagD;
else
	def=greatestDiagU;

if(abc>def)
	System.out.println(abc);
else
	System.out.println(def);
	}

}
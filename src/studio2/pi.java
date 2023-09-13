package studio2;
import java.util.Scanner;
public class pi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int count=100;
		int countIn=0;
		for(int i=1; i<=count; i++)
		{
			double x=Math.random()*2 -1;
			double y=Math.random()*2-1;
			if(x*x+y*y<=1)
			{
				countIn++;
			}
			//System.out.println("pi= " +(double)countIn/count*4);
		}
		System.out.println("pi= " +(double)countIn/count*4);
	}

}

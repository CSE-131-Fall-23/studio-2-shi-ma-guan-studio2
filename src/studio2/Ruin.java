package studio2;
import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Input your start amount");
		int startAmount = in.nextInt();
		System.out.println("Input the win chance");
		double winChance = in.nextDouble();
		System.out.println("Input the win limit");
		int winLimit=in.nextInt();
		System.out.println("Input the total simulations");
		int totalSimulations = in.nextInt();
		
		int lose=0;
		for(int time=1; time<=totalSimulations; time++) {
			int count =0;
			int amount = startAmount;
			while(0<amount && amount<winLimit) {
				count++;
				if(Math.random()<winChance) {
					amount++;
				}
				else {
					amount--;
				}
				System.out.println("Simulation"+time+": "+count);
			}
			
			if (amount<=0) {
				System.out.println("Lose");
				lose++;

			}
			else {
				System.out.println("Win");
			}
		}	
		System.out.println("Losses : " +lose+" Simulations: "+ totalSimulations);
		double ruinRate=(double)lose/totalSimulations;
		System.out.println("Ruin Rate from Simulation: " + ruinRate);
		double expectedRuin = 1-startAmount/winLimit;
		if(winChance !=0.5) {
			double a = (1-winChance)/(winChance);
			expectedRuin=(Math.pow(a, startAmount)-Math.pow(a, winLimit))/(1- Math.pow(a, winLimit));
		}
		System.out.println("Expected Ruin Rate: " +expectedRuin);
	}
}
	



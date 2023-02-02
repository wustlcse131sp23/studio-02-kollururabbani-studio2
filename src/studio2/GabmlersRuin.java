package studio2;

import java.util.Scanner;

public class GabmlersRuin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int startAmount = 2;
		int startAmountreal = 2;
		int winLimit = 10;
		int winMinimum = 0;
		int simulation = 1;
		int totalSimulations = 0;
		int losses = 0;
		int wins = 0;
		
		while (totalSimulations < 500)
		{
			totalSimulations = totalSimulations + 1;
			startAmount = startAmountreal;
			while ((winMinimum < startAmount) && (startAmount < winLimit))
			{
			
				boolean winChance;
				double random = Math.random();
				winChance = random > 0.5 ? true: false;
			
				
			
				if (winChance == true)
				{
					startAmount = startAmount + 1;
					
					
				}
		
		
				if (winChance == false)
				{
					startAmount = startAmount - 1;
						
				}
			}
			if (startAmount == winLimit)
			{
				wins += 1;
			}
			else if (startAmount == winMinimum)
			{
				losses += 1;
			}
		}
		System.out.println("Losses: " + losses + " Wins: " + wins + " Simulations: " + totalSimulations);
	}
	

}

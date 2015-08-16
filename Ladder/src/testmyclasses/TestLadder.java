// Avraham Moryosef
// CS 420
// 7/27/15

package testmyclasses;

import java.util.Scanner;
import exceptions.BottomOfLadderException;
import exceptions.TopOfLadderException;
import myclasses.Ladder;

public class TestLadder
{
	public static void main(String[] args)
	{
		String userEntry = "";
		
		Ladder rung = new Ladder();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Step (U)p, Step (D)own, or (Q)uit");
		userEntry = input.next();
		
		while(!userEntry.equalsIgnoreCase("Q"))
		{
			if(userEntry.equalsIgnoreCase("U"))
			{
				try
				{
					rung.stepUp();
				}
				catch(TopOfLadderException tole)
				{
					System.out.println(tole);
				}
				
				System.out.println(rung);
				System.out.println("Step (U)p, Step (D)own, or (Q)uit");
				userEntry = input.next();
			}
			
			else if(userEntry.equalsIgnoreCase("D"))
			{
				try
				{
					rung.stepDown();
				}
				catch(BottomOfLadderException tole)
				{
					System.out.println(tole);
				}
				
				System.out.println(rung);
				System.out.println("Step (U)p, Step (D)own, or (Q)uit");
				userEntry = input.next();
			}
			else if(!(userEntry.equalsIgnoreCase("U")) || !(userEntry.equalsIgnoreCase("D")) ||
					!(userEntry.equalsIgnoreCase("Q")))
			{
				System.out.println("Bad entry try again");
				System.out.println(rung);
				System.out.println("Step (U)p, Step (D)own, or (Q)uit");
				userEntry = input.next();
			}	
		}
		
		if(userEntry.equalsIgnoreCase("Q"))
		{
			System.out.println("Good Bye");
		}
		
		System.exit(1);
	}
}
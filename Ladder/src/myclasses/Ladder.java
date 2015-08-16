// Avraham Moryosef
// CS 420
// 7/27/15

package myclasses;

import exceptions.BottomOfLadderException;
import exceptions.TopOfLadderException;

public class Ladder
{
	private int currentRung;
	private int topRung;
	
	public Ladder()
	{
		setCurrentRung(0);
		setTopRung(4);
	}

	public int getCurrentRung()
	{
		return currentRung;
	}

	public void setCurrentRung(int currentRung)
	{
		this.currentRung = currentRung;
	}

	public int getTopRung()
	{
		return topRung;
	}

	public void setTopRung(int topRung)
	{
		this.topRung = topRung;
	}
	
	public void stepUp() throws TopOfLadderException
	{
		if(currentRung == topRung)
			throw new TopOfLadderException(
			         "You are already at the top.");
		
		else
			currentRung++;
	}
	
	public void stepDown() throws BottomOfLadderException
	{
		if(currentRung == 0)//
			throw new BottomOfLadderException(
			         "You are already at the bottom");
		else
			currentRung--;			
	}
	
	public String toString()
	{
		return "You are on rung " + getCurrentRung();
	}

}

// Avraham Moryosef
// CS 420
// 7/27/15

package exceptions;

public class BottomOfLadderException extends java.lang.Exception
{
	private static final long serialVersionUID = 1L;
	
		public BottomOfLadderException()
		{
			this("You are already at the bottom.");
		}
		
		public BottomOfLadderException(String msg)
		{
			super(msg);
		}

}
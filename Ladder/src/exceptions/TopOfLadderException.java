// Avraham Moryosef
// CS 420
// 7/27/15

package exceptions;

public class TopOfLadderException extends java.lang.Exception
{
	private static final long serialVersionUID = 1L;
	
	public TopOfLadderException()
	{
		this("You are already at the top.");
	}
	
	public TopOfLadderException(String msg)
	{
		super(msg);
	}
}
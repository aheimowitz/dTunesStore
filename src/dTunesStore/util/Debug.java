//---------------------------------------------------------------------
package dTunesStore.util;
//---------------------------------------------------------------------
public class Debug 
{
	private static int DEBUG_VALUE;

	// accessor and mutator for DEBUG_VALUE

	/**
	*	This method sets the debug value
	**/
	public void setValue(int value)
	{
		DEBUG_VALUE = value;
	}

	/**
	*	This method returns the debug value
	**/
	public int getValue()
	{
		return DEBUG_VALUE;
	} 
}
//---------------------------------------------------------------------

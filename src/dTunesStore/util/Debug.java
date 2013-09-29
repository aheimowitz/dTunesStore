//---------------------------------------------------------------------
package dTunesStore.util;
//---------------------------------------------------------------------
public class Debug 
{
	private static int DEBUG_VALUE;

	// accessor and mutator for DEBUG_VALUE

	/**
	*	This method sets the debug value
        @param value
	**/
	public void setValue(int value)
	{
		DEBUG_VALUE = value;
	}

	/**
	*	This method returns the debug value
        @return debug_value
	**/
	public int getValue()
	{
		return DEBUG_VALUE;
	} 
}
//---------------------------------------------------------------------

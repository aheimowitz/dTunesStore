//---------------------------------------------------------------------
package dTunesStore.driver;
//---------------------------------------------------------------------
import dTunesStore.util.Debug;
import dTunesStore.util.Results;
import dTunesStore.dataStore.PopulateWorker;
import dTunesStore.dataStore.SearchWorker;
//---------------------------------------------------------------------
public class Driver 
{
	//Variables to store the command line inputs
	private static String dataStoreFileName;
	private static int nn;
	private static String searchFileName;	
	private static int mm;
	private static int debug_value;

	/*Command line input format:
	   (dataStoreFileName NN searchFileName MM DEBUG_VALUE)
	*/
	public static void main(String args[]) 
	{
		if(args.length == 5)
		{
			dataStoreFileName = args[0];
			nn = Integer.parseInt(args[1]);
			searchFileName = args[2];
			mm = Integer.parseInt(args[3]);
			debug_value = Integer.parseInt(args[4]);

			//FIXME: remove when finished			
			/*for(int i = 0; i < 5; i++)
				System.out.println(args[i]);
			*/

			//Checks the range on mm
			if((mm > 0 && mm < 6)&&(nn > 0 && nn < 6)
				&&(debug_value >= 0 && debug_value < 5))
			{

				//NEED TO OPEN AND CLOSE THE TEXT FILES IN HERE
				
				
				
								
				System.out.println("Driver finished" +
				 " executing!");
			}			
			else
			{
				//Error
			}
			
		}
		else
		{
			//FIXME: Throw exception(?)
			System.out.println("ERROR: Invalid number of" +
					" arguments to the command line.");
		}

	} // end main(...)
} // end class Driver
//---------------------------------------------------------------------

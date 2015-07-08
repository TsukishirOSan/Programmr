import java.util.Scanner;
import java.io.*;
import java.util.IllegalFormatException;

/**
 * 
 * @author faiza harbi
 * @version 1.9
 * @since 08/07/2015
 * 
 * Takes an integer between 1 and 100 and prints out the integer as a String
 * ex: input 54; output :"fifty four"
 *
 *calls the inttostr class and its method to do so
 *@see inttostr.java
 */

public class IntToString{



	@SuppressWarnings("unused")
	private static inttostr its;
	private static Scanner sc;
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		String ones[]={"one","two","three","four","five","six"," seven", "eight","nine","ten","eleven","twelve","thirteen","forteen","fifteen","sixteen","seventeen","eighteen","ninteen"};      
        String tens[]={"twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninty"};       
        int number = 0;
        sc = new Scanner(System.in);
        // the input to be read in the console
		try{
		       // creates a console object
		       BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		       // if console is not null
		       if (b != null) 
		       {
		           // read line from the user input
		    	    System.out.println("Enter a number:");
		    	    sc = new Scanner(System.in);
	    	   		try{
	    	   			if(sc.hasNextInt()) // ISSUE NullPointerException
							number = sc.nextInt(); //Already outputs string "one"
	    	   		}catch(IllegalStateException scan)
	    	   		{
	    	   			System.err.println("scanner is closed");
	    	   		}
	    	   		catch( IllegalFormatException num1)
	    	   		{
	    	   			System.err.println("not a valid input or error in processing");
	    	   		}
		       }      
 
		    }catch(Exception ex){
       
		    	// if any error occurs
		    	ex.printStackTrace();
		    }
    	
    	System.out.println("Entered number is:");
 
    	its = new inttostr(number, ones, tens);
        	
      	}

}


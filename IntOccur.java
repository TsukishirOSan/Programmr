import java.io.BufferedReader;
import java.io.InputStreamReader;
public class IntOccur {
/**
 * @author faiza harbi
 * @since 07/09/2015
 * @version 2.1
 * Takes 2 inputs, cast the to ints, passes them as arguments
 * for the occurrence method that returns an int which is
 * printed out in main
 * 
 * @param arg
 * @throws Exception
 */


		public static void main(String arg[])throws Exception{
			int number = 0, n = 0;
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    System.out.println("Enter the number:");
		    try{
		    	number = Integer.parseInt(br.readLine());
		    }catch(NumberFormatException ie){
	   			System.err.println("not a valid input or error in processing");
	   			return;
	   		}
		    System.out.println("Enter number to search:");
		    try{
		    	n = Integer.parseInt(br.readLine());
		    }catch(NumberFormatException ie1){
	   			System.err.println("not a valid input or error in processing");
	   			return;
	   		}
		    System.out.println("Number of occurence of given number is:");
		    if((""+number).length() <= 11){ //Need checking!!!
		    	int result = Num_Occur.occurence(number, n);
		    	System.out.println(result);
		    }
		    
	}

}

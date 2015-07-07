/**
 * 
 * @author faiza harbi
 * @since 07/05/2015
 * 
 * Take a string as an input, change it to an int and check if the int is
 * binary or not.
 * Returns "is Binary" if so, "is not Binary" otherwise
 * @version 1.3
 * 
 */
public class checkbinary{
    
	private Scanner sc;

	checkbinary() throws IOException{
		
		String num = null;
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
							if(sc.hasNext())
								num = sc.next();
	    	   		}catch(IllegalStateException ie)
	    	   		{
	    	   			System.err.println("scanner is closed");
	    	   		}
	    	   		catch( NoSuchElementException num1)
	    	   		{
	    	   			System.err.println("not a valid input or error in processing");
	    	   		}
		       }      
 
		    }catch(Exception ex){
       
		    	// if any error occurs
		    	ex.printStackTrace();
		    }
	    	int l = num.length();
			
			int a;
			boolean bin = false;
			for(a = 0; a < l; a++){
			    char c = num.charAt(a);
			    if(c != '1' && c != '0'){
			        bin = false;
			        break;
			    }
			}
			if(a == l){
			    bin = true;
			}
		
		System.out.println("The number is:");
		    if(bin == true){
		        System.out.println("Binary");
		    }
		    else{
		        System.out.println("Not Binary");
		    }
   

	}
}
	

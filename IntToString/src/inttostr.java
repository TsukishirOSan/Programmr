import java.io.IOException;


public class inttostr{
	
	
	inttostr(int n, String[] ones, String[] tens)throws IOException {

		int num,rem,t;
		num = n;
		/*write down your logic here*/
		int save = num;
		t = num / 10;
		rem = num % 10;
		//System.out.println("num: "+num+" rem: "+rem);
		if((save >= 20) && (save % 10 == 0)){
			System.out.println(tens[(save-2)/10]);
		}
		else if((save > 20) && (t % 10 != 0)){
	        System.out.println(tens[save/10 - 2]+" "+ones[rem - 1]);
		}
		else if(t == 1){
			System.out.println(ones[9+rem]);
		}
		else{
			if((save < 10) && (rem != 0)){
				System.out.println(ones[rem-1]);
			}
			else{
				if((save < 10) && (rem == 0)){
					System.out.println(ones[0]);
				}
			}   
		} 
	}
}
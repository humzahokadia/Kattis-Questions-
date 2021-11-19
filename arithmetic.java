//this program was created by humzah Okadia on december 4 202
//this progam is the arithmatic problem
import java.util.*;
import java.io.*;
import java.math.*;
public class arithmetic {
	
	public static void main(String[] args) throws Exception{
		//Scanner scan = new Scanner(System.in);
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		String num = scan.readLine();
		BigInteger n = new BigInteger(num , 8);//turns the number to base10 
		System.out.print(n.toString(16));//converts to base16
	    }
}
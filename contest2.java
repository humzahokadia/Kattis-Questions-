//this program was created by humzah okadia, matt martin and nathan seit 
//this program is the hamiltonian hypercube problem 
import java.util.*;

public class contest2{

	static ArrayList<String> greycode (int n) //creates the greay code
	{ 
	    ArrayList<String> code = new ArrayList<String> (); 
	 
	    code.add("0"); 
	    code.add("1"); 
	 
	    int i, j; 
	    for (i = 2; i < (1<<n); i = i<<1) //fill the arraylist with the gray codes 
	    {  
	        for (j = i-1 ; j >= 0 ; j--) 
	            code.add(code.get(j)); 

	        for (j = 0 ; j < i ; j++) 
	            code.set(j, "0" + code.get(j)); 
	 
	        for (j = i ; j < 2*i ; j++) 
	            code.set(j, "1" + code.get(j)); 
	    } 
	 
	    //for (i = 0 ; i < code.size() ; i++ ) 
	        //System.out.println(code.get(i)); 
	    return code;
	} 
 


	public static void main(String[] args){
		ArrayList<String> code;
		ArrayList<String> codea = new ArrayList<String> ();
		ArrayList<String> codeb = new ArrayList<String> ();
		Scanner sc = new Scanner(System.in);
		String input; 
		int n;
		String a;
		String b;
		int count = 0;
		boolean iscount = false;
		input = sc.nextLine();
		String[] value = input.split(" ");//split the input into an in and two strings 
		n = Integer.parseInt(value[0]);
		a = value[1];
		b = value[2];
		System.out.println(value[1]);
		codea.add(a); 
		codeb.add(b); 
		code = greycode(n);//get the grey codes 
		for (int i = 0 ; i < code.size() ; i++ ) {
	        if (code.get(i).equals(codea.get(0))){//starts counting 
	        	iscount = true;

	        } 

	         if (code.get(i).equals(codeb.get(0))){//strops counting 
	        	iscount = false;
	        } 
	        if(iscount){//checks how many codes are in between a and b 
	        	count++;
	        }

	    }
	    System.out.println(count -1); //prints out the answer 
	}
}
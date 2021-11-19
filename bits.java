//this program was created by humzah okadia on october 15 2020
//this program is hte bits program.
import java.util.*;

public class bits {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();//cases

    for (int i = 0; i < num; i++)
        {
        String n = sc.next();
        int max = 0;
        for (int y = 1; y <= n.length(); y++)//tells max number of bit storage
            {
        	int z = Integer.bitCount(Integer.parseInt(n.substring(0 , y)));
        	
            if (z > max)
            	max = z;
            }
                
        System.out.println(max);
        }
    }
}
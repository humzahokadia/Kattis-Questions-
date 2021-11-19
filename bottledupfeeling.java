//this program was created by humzah okadia on december 6 2020
//this program is the bottled jp feelings program
import java.util.*;
public class bottledupfeeling {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] input = line.split(" ");//split up numbers
        int s = Integer.parseInt(input[0]);
		int v1 = Integer.parseInt(input[1]);
		int v2 = Integer.parseInt(input[2]);
		int num = s / v1;
		boolean flag = false;
		while ((s - (num * v1)) % v2 != 0)//checks number of bottles for v1 and v2
		{
			num--;	
			if (num == -1)
			{
				flag = true;
				break;
			}
		}
		if (flag)
			System.out.println("Impossible");//tells if impossible or gives answer
		else
			System.out.println(num + " " + ((s - (num * v1)) / v2));
	}
}
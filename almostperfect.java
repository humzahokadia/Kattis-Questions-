//this porgam was created by humzah okadia on november 2 2020
//this program is the almostperfect porgram
import java.util.*;
public class almostperfect 
{
	
	public static int isperfect(int num)//checks how close to perfect the sum is
	{
		int sum = 0;
		double n = Math.sqrt(num);
		int x = (int)n;
		if (x == n)
			sum = sum + x;
		
		for (int i = 2; i < n; i++)
		{
			if (num % i == 0)
				sum = sum + (i + (num / i));
		}

		return sum + 1;
	}

	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	while (sc.hasNextInt())
		{
		int num = sc.nextInt();
		int sum = isperfect(num);//tells user how close to perfect the sum is
		if (sum == num)
			System.out.println(num + " perfect");

		else if (Math.abs(sum - num) <= 2)
			System.out.println(num + " almost perfect");

		else
			System.out.println(num + " not perfect");
		}

	}
}
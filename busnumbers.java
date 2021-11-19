//this program was created by humzah okadai on november 3 2020
//this program is the busnumbers program
import java.util.*;

public class busnumbers {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int numbers = sc.nextInt();
	ArrayList<Integer> num = new ArrayList<Integer>();

	for (int y = 0; y < numbers; y++)
	{
		num.add(sc.nextInt());
	}

	Collections.sort(num);//sorts buses

	for (int i = 0; i < numbers; i++)
		{
		int length = 1;
		System.out.print(num.get(i));//checks if anynumbers are back to back
		
			for (int j = 1; i + j < num.size(); j++)
				if (num.get(i + j) == num.get(i + j - 1) + 1)
					length++;
				else
					break;
			
		if (length > 2)
		{
			System.out.print("-" + (num.get(i) + length - 1) + " ");//if they are get rid of middle nums and add -
			i += length - 1;
		}
		else
		{
			System.out.print(" ");
		}
		}

	}
}
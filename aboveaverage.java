//this program was created by humzah okadai on november 20 2020
//this program is the aboveaverage program
import java.util.*;

public class aboveaverage {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	ArrayList<Integer> lists = new ArrayList<Integer>();
	int num= sc.nextInt();
	int temp = 0;
	int count = 0;
	if (num >= 1 && num <= 50)
	{
		for(int i = 0; i < num; i++)
		{
			int sum = 0;
			float average = 0;
			count = 0;
			int nums = sc.nextInt();
			for(int y = 0; y < nums; y++)
			{
			
				temp = sc.nextInt();
				sum = sum + temp;
				lists.add(temp);//populate arraylist
			}
			average = sum/nums;
			//System.out.println((int)average);
			for(int x = nums - 1; x >= 0; x--)
			{
		
				if(lists.get(x) > (int)average)
				{
					count++;
				}
				lists.remove(x);
			}
			average = ((float)count / (float)nums) * 100;
			String formattedString = String.format("%.3f", average);//ghree decimal places
			System.out.println(formattedString + "%");
		}
	}
	
	}
}
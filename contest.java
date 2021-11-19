//this program was created by humzah okadia, matt martin, and nathan seit
//this program recreates the bottles song
//this code was accepted in the kattis and was correct
import java.util.*;

public class contest{

	public static void song(int num, String drink){
		String line1 = " bottles of ";
		String line9 = " on the wall, ";
		String line6  = " on the wall.";
		String line2 = "Take one down, pass it around, ";//the song lyrics 
		String line10 = "Take it down, pass it around, ";
		String line3 = " bottle of ";
		String line7 = " bottle of ";
		String line4 = " no more bottles of milk.";
		String line5 = " bottles of ";
		String line8 = " bottle of milk.";
		while (num > 0){
			while (num > 2){
				System.out.print(num+line1+drink+line9+num+line5+drink+"."+"\n");//the lyrics if over 2 bottles 
				num--;
				System.out.print(line2+num+line1+drink+line6+"\n\n");			}
		
			if (num == 2){
				System.out.print(num+line1+drink+line9+num+line5+drink+"."+"\n");//lyrics for 2 bottlwa 
					num--;
					System.out.print(line2+num+line7+drink+line6+"\n\n");
			}
			if (num == 1){
				System.out.print(num+line3+drink+line9+num+line3+drink+"."+"\n");//lyrics for 1 bottle
					num--;
					System.out.print(line10+"no more"+line1+drink+"."+"\n\n");

			}
	}

	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		boolean islet = true;
		int num = 0;
		String drink = "";
		int temp = sc.nextInt();//reads integer 
		if(temp >= 1 && temp <= 99) //makes sure int is in range
			num = temp;
		String temp2 = sc.next();//reads the drink name
		if (temp2.length() <=20 && temp2.length() >0) {//makes sure it is only 20 or less in size 
			for (int i = 0; i < temp2.length(); i++) {
         if ((Character.isLetter(temp2.charAt(i)) == false)) {//makes sure only letters in string
            islet = false;
         }
      }
      			if(islet)
					drink = temp2;
		}
		if(drink != "")
			song(num,drink);//makes the song

	}



}
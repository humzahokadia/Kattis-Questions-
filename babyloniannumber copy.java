//this program was created by humzah okadia on decmber 5 2020
//this progrblem is the babylonian numbers problem 
import java.util.*;

public class babyloniannumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int num = Integer.parseInt(line);
        for (int i = 0; i < num; i++) {
            line = sc.nextLine();
            if (line.charAt(line.length() - 1) == ',') {
                line += "0";
            } 
            for(int j = 0;j < line.length() - 1;j++) {
                if (line.charAt(j) == ',' && line.charAt(j + 1) == ',') {
                    line = line.substring(0, j + 1) + "0" + line.substring(j + 1, line.length());
                    j++;
                }
            }
            String[] input = line.split(",");
            long x = 0;
            for (int z = 0; z < input.length; z++) {
                if (!input[z].equals("0")) {
                    long y = (long) Math.pow(60, (input.length - 1 - z));
                    x += (y * Integer.parseInt(input[z]));
                }
            }
            System.out.println(x);
        }
    }
}
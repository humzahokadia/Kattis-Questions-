//this program was created by humzah okadia on November 221 2020
//this progrma is the ABC program

import java.util.*;

public class abc {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        String[] input = line1.split(" ");
        int max = 0;
        int mid = 0;//gonna be the three values
        int min = 100; 
        for (int i = 0; i < 3; i++){
            if(Integer.parseInt(input[i]) > max){
                max = Integer.parseInt(input[i]);
            }
        }
        min = max;
        for (int i = 0; i < 3; i++){
            if(Integer.parseInt(input[i]) < min){
                min = Integer.parseInt(input[i]);
            }
        }
        for (int i = 0; i < 3; i++){
            if(Integer.parseInt(input[i]) < max && Integer.parseInt(input[i]) > min){
                mid = Integer.parseInt(input[i]);
            }
        }
        String line2 = sc.nextLine();//checks what order to outoput the numbers
        if(line2.equals("ABC"))
        {
            System.out.println(min+" "+mid+" "+max);
        }
        if(line2.equals("ACB"))
        {
            System.out.println(min+" "+max+" "+mid);
        }
        if(line2.equals("BCA"))
        {
            System.out.println(mid+" "+max+" "+min);
        }
        if(line2.equals("BAC"))
        {
            System.out.println(mid+" "+min+" "+max);
        }
        if(line2.equals("CAB"))
        {
            System.out.println(max+" "+min+" "+mid);
        }
        if(line2.equals("CBA"))
        {
            System.out.println(max+" "+mid+" "+min);
        }


    }
}
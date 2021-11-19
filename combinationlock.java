//this program was created by humzah okadia on November 221 2020
//this progrma is the combination lock program

import java.util.*;

public class combinationlock {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int dial = 40;
        int angle = 360;
        int lock = angle / dial;
        while(true) {
            int degrees = 720;
            String line = sc.nextLine();
            if(line.equals("0 0 0 0")) 
                break;
            String[] input = line.split(" ");
            int first = Integer.parseInt(input[0]);
            int second = Integer.parseInt(input[1]);
            int third = Integer.parseInt(input[2]);            
            int fourth = Integer.parseInt(input[3]);
            if(second > first) 
                degrees += lock * ((dial - second) + first);//spins
            else 
                degrees += lock * Math.abs(first - second);
            degrees += angle;

            if(third < second) 
                degrees += lock * ((dial - second) + third);

            else 
                degrees += lock * Math.abs(third - second);

            if(fourth > third)
                degrees += lock * ((dial - fourth) + third);

            else 
                degrees += lock * Math.abs(fourth - third);
           System.out.println(degrees);    
        }

    }
}
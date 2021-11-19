//this program was created by humzah okadai on december 2
//this program is the backspace problem
import java.io.*;
import java.util.*;

public class backspace {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        char[] line = sc.nextLine().toCharArray();
        int x = line.length -1;
        int z = line.length -1;
        ArrayList<Character> arr = new ArrayList<Character>();
        for (int i = 0; i < line.length; i++) {
            arr.add(line[i]);
            int y = i;
            if(arr.get(i).equals('<')){
                arr.set(i,' ');
                if(arr.get(i-1).equals(' ')){
                    y = y -2;
                    while(arr.get(y).equals(' ')){
                        y = y -1;
                    } 
                    arr.set(y,' ');

                }
                else{
                    arr.set(i-1,' ');
                }
            }
            
        }
        /*for (int i = 0; i < line.length; i++) {
            int y = i;
            if(arr.get(i).equals('<')){
                arr.set(i,' ');
                if(arr.get(i-1).equals(' ')){
                    y = y -2;
                    while(arr.get(y).equals(' ')){
                        y = y -1;
                    } 
                    arr.set(y,' ');

                }
                else{
                    arr.set(i-1,' ');
                }
            }
        }*/
        for (int i = line.length - 1; i >= 0 ; i--) {
            if(arr.get(i).equals(' ')){
                arr.remove(i);
                x--;
            }
        }
         for (int i = 0; i <= x ; i++) {
            System.out.print(arr.get(i));
        }

       
    }
}
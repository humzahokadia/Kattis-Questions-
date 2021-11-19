//this prgoram was created by humzah okadia october 27 2020
//this program is the a list game program.
import java.io.*;
import java.util.*;

public class alistgame {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        while (num % 2 == 0) {
            num /= 2;
            count++;
        }
        for (int x = 3; x <= (int) Math.sqrt(num); x += 2)
            while (num % x == 0) {
                num /= x;
                count++;
            }

        if (num > 2)
            count++;
        System.out.println(count);
    }
}
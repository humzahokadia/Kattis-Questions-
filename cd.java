//this program was created by humzah okadia on november 21 2020
//this program is the cd problem
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.HashSet;

public class cd {
    public static void main(String[] args) throws Exception {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        String line = scan.readLine();
        String[] parts = line.split(" ");
        int x = Integer.parseInt(parts[0]);
        int y = Integer.parseInt(parts[1]);
        HashSet<String> cds = new HashSet<String>(1000000, 1.0f);
        while (x != 0 && y != 0) {

            for (int i = 0; i < x; i++) {
                String cd = scan.readLine();
                cds.add(cd);
            }

            int count = 0;
            for (int i = 0; i < y; i++) {
                String cd = scan.readLine();
                if (cds.contains(cd)) {
                    count++;
                }
            }

            System.out.println(count);
            line = scan.readLine();
            parts = line.split(" ");
            x = Integer.parseInt(parts[0]);
            y = Integer.parseInt(parts[1]);
            cds.clear();
        }
    }
}
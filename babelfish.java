//this program was created by humzah okadia on december 5 202
//this program is the babel fish program
import java.util.* ;
public class babelfish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,String> babel = new HashMap<>();//dictionary
        String line = sc.nextLine();
        while (!line.equals(""))
        {
            String[] dictionary = line.split(" ");
            String word = dictionary[0];//fills up dictionary
            String value = dictionary[1];
            babel.put(value,word);
            line = sc.nextLine();
        }       
        while(sc.hasNext())
        {
            line = sc.nextLine();//if any word has corresponding key print word
            if (! babel.containsKey(line)){
                System.out.println("eh");
            }
            else{
                System.out.println(babel.get(line));
            }
        }
    }
}
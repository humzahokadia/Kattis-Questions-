//this program was created by humzah okadia on november 29 2020
//this program is the bank queue problem
import java.util.*;
import java.io.*;
public class bankqueue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int cash = 0;
        int time = t;
        int x = 0;
        int[] inline = new int[t];
        ArrayList<Person> people = new ArrayList<Person>();
        for (int i = 0; i < n; i++) {
            people.add(new Person(sc.nextInt(), sc.nextInt()));//populate line

        }
        Collections.sort(people);//sort people
        while (time > 0 && x< people.size()) {
            Person person = people.get(x++);
            if (person.time < t) {
                for (int i = person.time; i >= 0; i--) {
                    if (inline[i] == 0) {
                        inline[i] = person.cash;
                        //System.out.println(inline[i]);
                        time--;
                        break;
                    }
                }
            }
        }
        
        for (int ppl : inline) { 
            cash += ppl;
        }

        System.out.println(cash);  
    }


    public static class Person implements Comparable<Person> {//person class 
         int cash;
         int time;

        public Person(int cash, int time) {//each person has cash adn wait time
            this.cash = cash;
            this.time = time;
        }

        //@Override
        public int compareTo(Person p) {//sort 
            final int kash = p.cash - this.cash;
            if (kash != 0) {
                return kash;
            }
            return p.time - this.time;
        }

    }
}

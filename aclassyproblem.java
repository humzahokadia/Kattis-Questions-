//this program was created by humzah okadia on november 26 2020
//this program is the a classy problem problem
import java.util.*;
import java.io.*;

public class aclassyproblem {

    static class person implements Comparable<person> {//person class

        public String name;
        public ArrayList<Integer> rank;

        public person(String name, String title) {//each person has a name and a title
            this.name = name;
            this.rank = new ArrayList<>();
            String[] ranking = title.split("-");
            int size = ranking.length - 1;
            for (int i = size; i >= 0; i--) { 
                if (ranking[i].equals("upper")) {
                    rank.add(3);
                } 
                if (ranking[i].equals("middle")) {//assigns a socail class
                    rank.add(2);
                } 
                if (ranking[i].equals("lower")) {
                    rank.add(1);
                }
            }
            for (int i = 0; i < 10; i++) {
                rank.add(2);
            }
        }

        public int compareTo(person x) {//sorts people 
            person p = x;
            for (int i = 0; i < 10; i++) {
                if (this.rank.get(i) == p.rank.get(i)) {
                    continue;
                }
                if (this.rank.get(i) > p.rank.get(i)) {
                    return -1;
                }
                if (this.rank.get(i) < p.rank.get(i)) {
                    return 1;
                }
            }
            return this.name.compareTo(p.name);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < cases; i++) {
            int n = Integer.parseInt(sc.nextLine());
            ArrayList<person> list = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                String[] s = sc.nextLine().split(" ");
                String word = s[0].replace(":", "");
                list.add(new person(word, s[1]));//populate people
            }
            Collections.sort(list);
            for (person p : list) {
                System.out.println(p.name);
            }
            System.out.println("==============================");
        }
    }
}
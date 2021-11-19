//Babelfish
//Matthew Martin
//105029366

import java.util.*;

// class Entry
// {
//   String english;
//   String translation;
//
//   public Entry(String a, String b)
//   {
//     this.english = a;
//     this.translation = b;
//   }
// }


public class BabelFish
{
  public static void main(String[] args)
  {
    ArrayList<String> wordsEnglish = new ArrayList<String>();
    ArrayList<String> wordsForeign = new ArrayList<String>();
    ArrayList<String> inputTest = new ArrayList<String>();

    Scanner sc = new Scanner(System.in);

    while(true)
    {
      String temp = sc.nextLine();
      String[] temp_split = temp.split(" ");

      if(temp_split.length==2)
      {
        wordsEnglish.add(temp_split[0]);
        wordsForeign.add(temp_split[1]);
      }
      else
      {
        break;
      }
    }

    //System.out.println("test");

    while(true)
    {
    String temp = sc.nextLine();  
    for(int x=0; x<inputTest.size(); x++)
    {
      if(wordsForeign.contains(temp))
      {
        for(int y=0; y<wordsForeign.size(); y++)
        {
          if(wordsForeign.get(y).equals(temp))
            System.out.println(wordsEnglish.get(y));
        }
      }
      else
        System.out.println("eh");
    }
    }



  }
}

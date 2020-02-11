// aa | abb
import java.io.*;

public class quest3
{
  public static void main(String[] args) throws Exception {
    FileReader fr = new FileReader("q3.txt");

    char c;
    int i;

    //dfa variables
    int index = 1;

    //start state: 0; accept: 6
    int state = 0;

    while( (i = fr.read()) != -1)
    {
      c = (char) i;
      // System.out.print("character: ");
      // System.out.println(c);
      // System.out.println(index);
      switch(state)
      {
        case 0:
          if(c == 'a')
          {
            state = 1;
          }
          break;
        case 1:
          if(c == 'a')
          {
            state = 2;
          }
          else if (c == 'b')
          {
            state = 3;
          }
          else
          {
            state = 0;
          }
          break;
        case 3:
          if(c == 'b')
          {
            state = 4;
          }
          else
          {
            state = 0;
          }
          break;
      }

      // System.out.print("state: ");
      // System.out.println(state);
      if(state == 2)
      {
        state = 1;
        System.out.println(index);
      }
      if(state == 4)
      {
        System.out.println(index);
        state = 0;
      }
      index++;
    }
  }
}

//abc*cba

import java.io.*;

public class quest2
{
  public static void main(String[] args) throws Exception {

    //file reading variables
    FileReader fr = new FileReader("q2.txt");
    char c;
    int i;

    //dfa variables
    int index = 1;

    //start state: 0; accept: 6
    int state = 0;


    while( (i = fr.read()) != -1)
    {
      c = (char) i;
      // System.out.print(c);

      switch(state)
      {
        case 0:
          if(c == 'a')
          {
            // System.out.println()
            state = 1;
          }
          break;
        case 1:
          if(c == 'b')
          {
            state = 2;
          }
          else
          {
            state = 0;
          }
          break;
        case 2:
          if(c == 'c')
          {
            state = 3;
          }
          else
          {
            state = 0;
          }
          break;
        case 3:
          if(c == 'c')
          {
            state = 4;
          }
          break;
        case 4:
          if(c == 'b')
          {
            state = 5;
          }
          else
          {
            state = 3;
          }
          break;
        case 5:
          if(c == 'a')
          {
            state = 6;
          }
          else
          {
            state = 3;
          }
          break;

      }

    if(state == 6)
    {

      System.out.println(index);
      state = 3;
    }
    index++;
    }
  }
}

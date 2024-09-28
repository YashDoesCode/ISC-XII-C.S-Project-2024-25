package StringBased.PreviousYearPracticalPaper;

import java.util.*;

public class SnowballString 
{
    String sent;

    void input()
    {
        Scanner as = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        sent = as.nextLine();
    }

    boolean isSnowball(String s)
    {
        StringTokenizer st = new StringTokenizer(sent, ".? ");
        String x = st.nextToken();
        int c = x.length();

        while(st.hasMoreTokens())
        {
             x = st.nextToken();
            if(++c != x.length())
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        SnowballString obj = new SnowballString();
        String check = "abcdefghijklmnopqrstuvwxyz.? ";
        
        obj.input();

        int l = obj.sent.length();

        for(int i = 0; i<l; i++)
        {   char x = Character.toLowerCase(obj.sent.charAt(i));
            if(check.indexOf(x) == -1)
            {
                System.out.println("Incorrect Terminating Character. Invalid Input");
                System.exit(0);
            }
        }
            if(obj.isSnowball(obj.sent))
                System.out.println("It is a Snowball String");
            else
                System.out.println("It is not a Snowball String");
}
}
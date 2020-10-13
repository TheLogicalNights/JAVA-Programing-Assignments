/*
    Problem Statement : Accept sing from user and reverse the contents of that string
                        by toggling the case.

                        Input : “aCBdef”
                        Output : “FEDcbA”
*/

import java.util.*;

class StringDemo
{
    void StrRev(String str)
    {
        int i = 0;
        char s[] = str.toCharArray();
        System.out.print("Reversed String is : ");
        for(i=s.length-1;i>=0;i--)
        {
            if((s[i]>='A') && (s[i]<='Z'))
            {
                s[i] = (char)((int)s[i]+32);
            }
            else if((s[i]>='a') && (s[i]<='z'))
            {
                s[i] = (char)((int)s[i]-32);
            }
            System.out.print(""+s[i]);
        }
        System.out.println();
    }
}
class Main
{
    public static void main(String args[])
    {
        Scanner cin = new Scanner(System.in);
        StringDemo sobj = new StringDemo();

        System.out.println("Enter a String");
        String str = cin.nextLine();

        sobj.StrRev(str);
    }
}
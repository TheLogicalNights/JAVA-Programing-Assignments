/*
    Problem Statement : Accept string from user and check whether the string is
                        palindrome or not without considering its case.

                        Input : “1abccBA1”
                        Output : TRUE
*/

import java.util.*;

class StringDemo
{
    boolean Palindrome(String s1)
    {
        int i = 0;
        String str = s1.toLowerCase();
        int iSize = str.length();
        char rev[] = new char[iSize+1];
        char s[] = str.toCharArray();
        int j = 0;
        for(i=s.length-1;i>=0;i--)
        {
            rev[j] = s[i];
            j++;
        }
        for(i=0;i<rev.length-1;i++)
        {
            if(rev[i] != s[i])
            {
                break;
            }
        }
        
        if(i==s.length)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
class Main
{
    public static void main(String args[])
    {
        Scanner cin = new Scanner(System.in);
        StringDemo sobj = new StringDemo();
        boolean bRet = false;

        System.out.println("Enter a String");
        String str = cin.nextLine();

        bRet = sobj.Palindrome(str);

        if(bRet==true)
        {
            System.out.println(str+" is palindrome");
        }
        else
        {
            System.out.println(str+" is not palindrome");
        }
    }
}
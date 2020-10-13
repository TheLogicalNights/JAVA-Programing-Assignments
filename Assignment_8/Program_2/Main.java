/*
    Problem Statement : Write a program which 2 strings from user and check whether
                        contents of two strings are equal or not.

                        Input :
                                “Marvellous Infosystems”
                                “Marvellous Infosystems”
                        Output : TRUE
*/

import java.util.*;

class StringDemo
{
    boolean StrCmpX(String str1,String str2)
    {
        char s1[] = str1.toCharArray();
        char s2[] = str2.toCharArray();

        int iSize1 = str1.length();
        int iSize2 = str2.length();
        int i = 0;
        
        if(iSize1!=iSize2)
        {
            return false;
        }

        for(i=0;i<iSize1;i++)
        {
            if(s1[i]!=s2[i])
            {
                break;
            }
        }

        if(i==iSize1)
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
        boolean bRet = false;
        Scanner cin = new Scanner(System.in);
        StringDemo sobj = new StringDemo();

        System.out.println("Enter first string");
        String str1 = cin.nextLine();
        System.out.println("Enter second string");
        String str2 = cin.nextLine();

        bRet = sobj.StrCmpX(str1,str2);

        if(bRet==true)
        {
            System.out.println("Contents of "+str1+" and "+str2+" are same");
        }
        else
        {
            System.out.println("Contents of "+str1+" and "+str2+" are same not the same");
        }
    }
}
/*
    Problem Statement : Write a program which 2 strings from user and check whether
                        first N contents of two strings are equal or not.
                        Note : If third parameter is greater than the size of second string
                        then concat whole string after first string.

                        Input :
                                “Marvellous Infosystems”
                                “Marvellous Logic Building”
                                10

                        Output : TRUE
*/

import java.util.*;

class StringDemo
{
    boolean StrNCmp(String str1,String str2,int iNo)
    {
        char s1[] = str1.toCharArray();
        char s2[] = str2.toCharArray();
        int i = 0;

        for(i=0;i<iNo;i++)
        {
            if(s1[i]!=s2[i])
            {
                break;
            }
        }
        
        if(i==iNo)
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

        System.out.println("Enter first string");
        String str1 = cin.nextLine();
        System.out.println("Enter second string");
        String str2 = cin.nextLine();

        System.out.println("Enter number");
        int iNo = cin.nextInt();

        boolean bRet = sobj.StrNCmp(str1,str2,iNo);

        if(bRet==true)
        {
            System.out.println("First "+iNo+" containts of "+str1+" and "+str2+" are same");
        }
        else
        {
            System.out.println("First "+iNo+" containts of "+str1+" and "+str2+" are not same");
        }
    }
}
/*
    Problem Statement : Write a java program which accept string from user and check
                        whether it contains vowels in it or not.

                        Input : “marvellous”
                        Output : TRUE

                        Input : “Demo”
                        Output : TRUE

                        Input : “xyz”
                        Output : FALSE
*/ 

import java.util.*;

class StringOperation
{
    boolean ChkVowel(String str)
    {
        int iCnt = 0;
        for(iCnt=0;iCnt<(str.length());iCnt++)
        {
            if((str.charAt(iCnt)=='a') || (str.charAt(iCnt)=='e') || (str.charAt(iCnt)=='i') || (str.charAt(iCnt)=='o') || (str.charAt(iCnt)=='u') ||
                (str.charAt(iCnt)=='A') || (str.charAt(iCnt)=='E') || (str.charAt(iCnt)=='I') || (str.charAt(iCnt)=='O') || (str.charAt(iCnt)=='U'))
            { 
                break;
            }
        }
        if(iCnt<(str.length()))
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

        System.out.println("Enter a string");
        String str = cin.nextLine();

        StringOperation sobj = new StringOperation();

        boolean bRet = sobj.ChkVowel(str);
        if(bRet==true)
        {
            System.out.println("Vowels are present");
        }
        else
        {
            System.out.println("Vowels are not present");
        }
    }
}
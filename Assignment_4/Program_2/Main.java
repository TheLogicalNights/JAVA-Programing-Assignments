/*
    Problem Statement : Write a Java program which accept string from user and count
                        number of small characters.

                        Input : “Marvellous”
                        Output : 9
*/ 

import java.util.*;

class StringOperation
{
    int CountSmall(String str)
    {
        int iCount = 0;
        for(int iCnt=0;iCnt<(str.length());iCnt++)
        {
            if((str.charAt(iCnt)>='a') && (str.charAt(iCnt)<='z'))
            iCount++;
        }
        return iCount;
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

        int iRet = sobj.CountSmall(str);

        System.out.println("Count of small characters are : "+iRet);
    }
}
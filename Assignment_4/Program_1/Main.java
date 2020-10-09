/*
    Problem Statement : Write a Java program which accept string from user and count
                        number of capital characters.

                        Input : “Marvellous Multi OS”
                        Output : 4
*/ 

import java.util.*;

class StringOperation
{
    int CountCapital(String str)
    {
        int iCount = 0;
        for(int iCnt=0;iCnt<(str.length());iCnt++)
        {
            if((str.charAt(iCnt)>='A') && (str.charAt(iCnt)<='Z'))
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

        int iRet = sobj.CountCapital(str);

        System.out.println("Count of capital characters are : "+iRet);
    }
}
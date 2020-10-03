/*
    Problem Statement : Write a java program which accept number from user and return the
                        count of odd digits.

                        Input : 2395
                        Output : 3

                        Input : 1018
                        Output : 2

                        Input : -1018
                        Output : 2

                        Input : 8462
                        Output : 0
*/

import java.util.*;

class Numbers
{
    int CountOdd(int iNo)
    {
        int iCount = 0;
        int iDigit = 0;
        if(iNo<0)
        {
            iNo = -iNo;
        }
        while(iNo!=0)
        {
            iDigit = iNo % 10;
            if((iDigit%2)!=0)
            {
                iCount++;
            }
            iNo = iNo / 10;
        }
        return iCount;
    }
}
class Main
{
    public static void main(String args[])
    {
        Scanner cin = new Scanner(System.in);
        Numbers nobj = new Numbers();

        System.out.println("Ente number");
        int iNo = cin.nextInt();

        int iRet = nobj.CountOdd(iNo);

        System.out.println("Count of odd digits is : "+iRet);
    }
}
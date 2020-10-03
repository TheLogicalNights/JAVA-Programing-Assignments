/*
    Problem Statement : Write a program which accept number from user and return the
                        count of digits in between 3 and 7.

                        Input : 2395
                        Output : 1

                        Input : 1018
                        Output : 0

                        Input : 4521
                        Output : 2

                        Input : 9922
                        Output : 0
*/

import java.util.*;

class Numbers
{
    int Count(int iNo)
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
            if((iDigit>3) && (iDigit<7))
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

        int iRet = nobj.Count(iNo);

        System.out.println("Count of digits between 3 and 7 is : "+iRet);
    }
}
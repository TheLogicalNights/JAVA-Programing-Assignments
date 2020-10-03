/*
    Problem Statement : Write a java program which accept number from user and return the
                        count of even digits.

                        Input : 2395
                        Output : 1

                        Input : 1018
                        Output : 2

                        Input : -1018
                        Output : 2

                        Input : 8462
                        Output : 4
*/

import java.util.*;

class Numbers
{
    int CountEven(int iNo)
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
            if((iDigit%2)==0)
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

        int iRet = nobj.CountEven(iNo);

        System.out.println("Count of even digits is : "+iRet);
    }
}
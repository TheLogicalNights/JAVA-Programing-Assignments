/*
    Problem Statement : Write a program which accept number from user and return
                        difference between summation of even digits and summation of odd
                        digits.

                        Input : 2395
                        Output : -15

                        Input : 1018
                        Output : 6

                        Input : 8440
                        Output : 16

                        Input : 5733
                        Output : -18
*/

import java.util.*;

class Numbers
{
    int Difference(int iNo)
    {
        int iDigit = 0;
        int iEven = 0;
        int iOdd = 0;
        if(iNo<0)
        {
            iNo = -iNo;
        }
        while(iNo!=0)
        {
            iDigit = iNo % 10;
            if((iDigit%2)==0)
            {
                iEven = iEven + iDigit;
            }
            else
            {
                iOdd = iOdd + iDigit;
            }
            iNo = iNo / 10;
        }
        return iEven-iOdd;
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

        int iRet = nobj.Difference(iNo);

        System.out.println("Difference between even and odd digits is : "+iRet);
    }
}
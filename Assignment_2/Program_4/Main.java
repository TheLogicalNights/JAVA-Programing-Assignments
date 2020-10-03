/*
    Problem Statement : Write a program which accept number from user and return
                        multiplication of all digits.

                        Input : 2395
                        Output : 270

                        Input : 1018
                        Output : 8

                        Input : 9440
                        Output : 144

                        Input : 9922432
                        Output : 7776
*/

import java.util.*;

class Numbers
{
    int Product(int iNo)
    {
        int iProduct = 1;
        int iDigit = 0;
        if(iNo<0)
        {
            iNo = -iNo;
        }
        while(iNo!=0)
        {
            iDigit = iNo % 10;
            if(iDigit==0)
            {
                iDigit = 1;
            }
            iProduct = iProduct * iDigit;
            iNo = iNo / 10;
        }
        return iProduct;
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

        int iRet = nobj.Product(iNo);

        System.out.println("Multiplication of all digits is : "+iRet);
    }
}
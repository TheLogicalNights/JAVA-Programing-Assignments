/*
    Problem Statement : Write Java program which accept N numbers from user and return
                        difference between summation of even elements and summation of
                        odd elements.

                        Input : N : 6
                        Elements : 85 66 3 80 93 88

                        Output : 53 (234 - 181)
*/

import java.util.*;

class Numbers
{
    int Difference(int arr[])
    {
        int iEven = 0;
        int iOdd = 0;
        for(int iCnt=0;iCnt<arr.length;iCnt++)
        {
            if((arr[iCnt]%2)==0)
            {
                iEven = iEven + arr[iCnt];
            }
            else
            {
                iOdd = iOdd + arr[iCnt];
            }
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

        System.out.println("Enter how many numbers do you want");
        int iNo = cin.nextInt();

        int arr[] = new int[iNo];

        System.out.println("Enter numbers");
        for(int iCnt=0;iCnt<iNo;iCnt++)
        {
            arr[iCnt] = cin.nextInt();
        }

        int iRet = nobj.Difference(arr);

        System.out.println("Difference between summation of even and odd numbers is : "+iRet);
    }
}
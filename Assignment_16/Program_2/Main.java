/*
    Problem Statement : Write java program which accept array from user and replace each
                        member with summation of its digit.
*/

import java.util.*;

class Array
{
    int[] SumOfDigits(int arr1[])
    {
        int iDigit = 0;
        int iSum = 0;
        int i = 0;
        for(i=0;i<arr1.length;i++)
        {
            iSum=0;
            while(arr1[i]!=0)
            {
                iDigit = arr1[i] % 10;
                iSum = iSum + iDigit;
                arr1[i] = arr1[i]/10;
            }
            arr1[i] = iSum;
        }  
        return arr1; 
    }
}

class Main
{
    public static void main(String args[])
    {
        Scanner cin = new Scanner(System.in);
        Array aobj = new Array();

        System.out.println("How many elements do you want ?");
        int iNo1 = cin.nextInt();

        int arr1[] = new int[iNo1];

        System.out.println("Enter the elements of array");
        for(int i=0;i<iNo1;i++)
        {
            arr1[i] = cin.nextInt();
        }

        int iRet[] = aobj.SumOfDigits(arr1);

        System.out.println("Elements of new array are :");
        for(int i=0;i<iNo1;i++)
        {
            System.out.printf(iRet[i]+"\t");
        }
        System.out.println();
    }
}
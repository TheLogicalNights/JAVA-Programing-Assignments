/*
    Problem Statement : Write a java program which accept two array from user and check
                        whether that array and its elements are palindrome or not.
*/

import java.util.*;

class Array
{
    boolean ChkPallindrome(int arr1[])
    {
        int iDigit = 0;
        int iTemp = 0;
        int iRev = 0;
        int i = 0;
        for(i=0;i<arr1.length;i++)
        {
            iTemp = arr1[i];
            iRev=0;
            while(iTemp!=0)
            {
                iDigit = iTemp % 10;
                iRev = (iRev*10)+iDigit;
                iTemp = iTemp/10;
            }
            if(iRev!=arr1[i])
            {
                break;
            }
        }
        if(i==arr1.length)
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
        Array aobj = new Array();

        System.out.println("How many elements do you want ?");
        int iNo1 = cin.nextInt();

        int arr1[] = new int[iNo1];

        System.out.println("Enter the elements of array");
        for(int i=0;i<iNo1;i++)
        {
            arr1[i] = cin.nextInt();
        }

        boolean bRet = aobj.ChkPallindrome(arr1);
        
        if(bRet==true)
        {
            System.out.println("Elements and array is pallindrome");
        }
        else
        {
            System.out.println("Elements and array is not pallindrome");
        }
    }
}
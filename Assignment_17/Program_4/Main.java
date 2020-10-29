/*
    Problem Statement : Write Java program which accept array of characters from user and
                        return difference between frequency of capital and frequency of small
                        characters.
*/

import java.util.*;
import java.lang.*;
class Array
{
    int Difference(char arr1[])
    {
        int i = 0;
        int iDifference = 0;
        for(i=0;i<arr1.length;i++)
        {
            if((arr1[i]>='A') && (arr1[i]<='Z'))
            {
                iDifference++;
            }
            else if((arr1[i]>='a') && (arr1[i]<='z'))
            {
                iDifference--;
            }

        } 
        return iDifference; 
    }
}

class Main
{
    public static void main(String args[])
    {
        Scanner cin = new Scanner(System.in);
        Array aobj = new Array();

        System.out.println("How many characters do you want ?");
        int iNo1 = cin.nextInt();

        char arr1[] = new char[iNo1];

        System.out.println("Enter the elements of array");
        for(int i=0;i<iNo1;i++)
        {
            char ch = cin.next().charAt(0);
            arr1[i] = ch;
        }

        int iRet = aobj.Difference(arr1);

        System.out.println("Difference between upper case elements and lower case elements is : "+iRet);
    }
}

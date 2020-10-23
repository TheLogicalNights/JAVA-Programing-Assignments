/*
    Problem Statement : Write a java program which accept two array from user and copy
			the contents of that array into another array in reverse order and
			return new array.
*/

import java.util.*;

class Array
{
    int[] Reverse(int arr1[])
    {
        int arr2[] = new int[arr1.length];
        int j = 0; 
        for(int i=arr1.length-1;i>=0;i--)
        {
            arr2[j] = arr1[i];
            j++;
        }
        return arr2;
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

        int iRet[] = aobj.Reverse(arr1);
        System.out.println("Elements of new array are :");
        for(int i=0;i<iNo1;i++)
        {
            System.out.printf(iRet[i]+"\t");
        }
        System.out.println();
    }
}

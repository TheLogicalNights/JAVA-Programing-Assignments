/*
    Problem Statement : Write Java program which accept two arrays from user and display
                        even contents of each array.

                        Input : 2 9 6 5 2 3
                                45 6 12 18 23 4

                        Output : 2 6 2
                                 6 12 18 4  
*/

import java.util.*;

class Array
{
    void DisplayEven(int arr1[],int arr2[])
    {
        System.out.println("Elements of 1st array : ");
        for(int i=0;i<arr1.length;i++)
        {
            if((arr1[i]%2)==0)
            {
                System.out.printf(arr1[i]+"\t");
            }
        }
        System.out.println();
        System.out.println("Elements of 2nd array");
        for(int i=0;i<arr2.length;i++)
        {
            if((arr2[i]%2)==0)
            {
                System.out.printf(arr2[i]+"\t");
            }
        }
        System.out.println();
    }
}

class Main
{
    public static void main(String args[])
    {
        Scanner cin = new Scanner(System.in);
        Array aobj = new Array();

        System.out.println("How many elements do you want in 1st array ?");
        int iNo1 = cin.nextInt();
        System.out.println("How many elements do you want in 2nd array ?");
        int iNo2 = cin.nextInt();

        int arr1[] = new int[iNo1];
        int arr2[] = new int[iNo2];

        System.out.println("Enter the elements of 1st array");
        for(int i=0;i<iNo1;i++)
        {
            arr1[i] = cin.nextInt();
        }

        System.out.println("Enter the elements of 2nd array");
        for(int i=0;i<iNo2;i++)
        {
            arr2[i] = cin.nextInt();
        }

        aobj.DisplayEven(arr1,arr2);
    }
}

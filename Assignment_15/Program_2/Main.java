/*
    Problem Statement : Write a java program which accept two two arrays from user and
			display minimum element of each array.

                        Input : 2 9 7 5 2 3
                                9 3 5 5

                        Output : 2 3
*/

import java.util.*;

class Array
{
    void Minimum(int arr1[],int arr2[])
    {
        int iMin1 = arr1[0];
        int iMin2 = arr2[0];
        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i]<iMin1)
            {
                iMin1 = arr1[i];
            }
        }
        for(int i=0;i<arr2.length;i++)
        {
            if(arr2[i]<iMin2)
            {
                iMin2 = arr2[i];
            }
        }
        System.out.println("Minimum of 1st array is :"+iMin1);
        System.out.println("Minimum of 2nd array is :"+iMin2);
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

        aobj.Minimum(arr1,arr2);
    }
}

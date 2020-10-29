/*
    Problem Statement : Write Java program which accept array from user and display below
                        pattern.
                        
                        Input : 8 9 7 6 4 2 4

                        Output : * * * * * * * * 
                                 * * * * * * * * *
                                 * * * * * * * 
                                 * * * * * *
                                 * * * *
                                 * * 
                                 * * * *
*/

import java.util.*;
import java.lang.*;
class Pattern
{
    void Display(int arr1[])
    {
        int i = 0;
        int iDifference = 0;
        for(i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1[i];j++)
            {
                System.out.printf("*\t");
            }
            System.out.println();
        }  
    }
}

class Main
{
    public static void main(String args[])
    {
        Scanner cin = new Scanner(System.in);
        Pattern pobj = new Pattern();

        System.out.println("How many elements do you want ?");
        int iNo1 = cin.nextInt();

        int arr1[] = new int[iNo1];

        System.out.println("Enter the elements of array");
        for(int i=0;i<iNo1;i++)
        {
            arr1[i] = cin.nextInt();
        }

        pobj.Display(arr1);
    }
}

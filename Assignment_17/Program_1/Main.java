/*
    Problem Statement : Write Java program which accept array of characters from user and
                        replace each capital character with its corresponding small character.
*/

import java.util.*;
import java.lang.*;
class Array
{
    char[] UpperToLower(char arr1[])
    {
        int i = 0;
        for(i=0;i<arr1.length;i++)
        {
            if((arr1[i]>='A') && (arr1[i]<='Z'))
            {
                arr1[i] = Character.toLowerCase(arr1[i]);
            }
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

        System.out.println("How many characters do you want ?");
        int iNo1 = cin.nextInt();

        char arr1[] = new char[iNo1];

        System.out.println("Enter the elements of array");
        for(int i=0;i<iNo1;i++)
        {
            char ch = cin.next().charAt(0);
            arr1[i] = ch;
        }

        char iRet[] = aobj.UpperToLower(arr1);

        System.out.println("Elements from new array are : ");
        for(int i=0;i<iNo1;i++)
        {
            System.out.printf(iRet[i]+"\t");
        }
        System.out.println();
    }
}

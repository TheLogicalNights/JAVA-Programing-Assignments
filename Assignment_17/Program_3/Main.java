/*
    Problem Statement : Write Java program which accept array of characters from user and
                        accept one character. Return occurrence of that character without
                        considering case.
*/

import java.util.*;
import java.lang.*;

class Array
{
    int OccurrenceCount(char arr1[],char ch)
    {
        int i = 0;
        int iCnt = 0;
        for(i=0;i<arr1.length;i++)
        {
            if((arr1[i]>='A') && (arr1[i]<='Z'))
            {
                arr1[i] = Character.toLowerCase(arr1[i]);
            }
            if((ch>='A') && (ch<='Z'))
            {
                ch = Character.toLowerCase(ch);
            }
            if(arr1[i]==ch)
            {
                iCnt++;
            }
        }  
        return iCnt; 
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

        System.out.println("Enter the element that you want count occurrence count");
        char ch = cin.next().charAt(0);

        int iRet = aobj.OccurrenceCount(arr1,ch);

        System.out.println("Occurrence count is : "+iRet);
    }
}

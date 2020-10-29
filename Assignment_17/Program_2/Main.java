/*
    Problem Statement : Write Java program which accept array of characters from user and
                        return vowel count from array.
*/

import java.util.*;
import java.lang.*;
class Array
{
    int VowelCount(char arr1[])
    {
        int i = 0;
        int iCnt = 0;
        for(i=0;i<arr1.length;i++)
        {
            if((arr1[i]=='A') || (arr1[i]=='E') || (arr1[i]=='I') || (arr1[i]=='O') || (arr1[i]=='U')
            || (arr1[i]=='a') || (arr1[i]=='e') || (arr1[i]=='i') || (arr1[i]=='o') || (arr1[i]=='u'))
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

        int iRet = aobj.VowelCount(arr1);

        System.out.println("Vowel count is : "+iRet);
    }
}

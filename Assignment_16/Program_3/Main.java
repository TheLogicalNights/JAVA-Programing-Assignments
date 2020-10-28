/*
    Problem Statement : Write java program which accept array of characters from user and count the 
                        member of capital characters.
*/

import java.util.*;

class Array
{
    int CapitalCount(char arr1[])
    {
        int iCnt = 0;
        int i = 0;
        for(i=0;i<arr1.length;i++)
        {
            if((arr1[i]>='A') && (arr1[i]<='Z'))
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

        int iRet = aobj.CapitalCount(arr1);

        System.out.println("Count of capital characters is : "+iRet);
    }
}

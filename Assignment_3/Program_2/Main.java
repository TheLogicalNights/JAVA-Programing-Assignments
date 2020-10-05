/*
    Problem Statement : Write java program which accept N numbers from user and accept
                        one another number as NO , return index of first occurrence of that
                        NO.

                        Input : N : 6
                                NO: 66

                                Elements : 85 66 3 66 93 88

                        Output : 2

                        Input : N : 6
                                NO: 12

                                Elements : 85 11 3 15 11 111

                        Output : -1
*/

import java.util.*;

class Numbers
{
    int FirstOccurance(int arr[],int iNo)
    {
        int iCnt = 0;
       for(iCnt=0;iCnt<arr.length;iCnt++)
       {
           if(arr[iCnt]==iNo)
           {
               break;
           }
       }
       if(iCnt<(arr.length))
       {
           return iCnt;
       }
       else
       {
           return -1;
       }
    }
}
class Main
{
    public static void main(String args[])
    {
        Scanner cin = new Scanner(System.in);
        Numbers nobj = new Numbers();

        System.out.println("Enter how many numbers do you want");
        int iNo = cin.nextInt();

        int arr[] = new int[iNo];

        System.out.println("Enter numbers");
        for(int iCnt=0;iCnt<iNo;iCnt++)
        {
            arr[iCnt] = cin.nextInt();
        }

        System.out.println("Enter number do you want to search");
        int iNumber = cin.nextInt();

        int iRet = nobj.FirstOccurance(arr,iNumber);

        System.out.println("Index of first occurence of "+iNumber+" is : "+iRet);    
    }
}
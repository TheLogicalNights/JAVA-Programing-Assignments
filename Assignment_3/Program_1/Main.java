/*
    Problem Statement : Write java program which accept N numbers from user and accept
                        one another number as NO , check whether NO is present or not.

                        Input : N : 6
                                NO: 66

                                Elements : 85 66 3 66 93 88

                        Output : True
*/

import java.util.*;

class Numbers
{
    boolean ChkPresence(int arr[],int iNo)
    {
        int iCnt = 0;
       for(iCnt=0;iCnt<arr.length;iCnt++)
       {
           if(arr[iCnt]==iNo)
           {
               break;
           }
       }
       if(iCnt==(arr.length))
       {
           return false;
       }
       else
       {
           return true;
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

        System.out.println("Enter how many numbers do you want");
        int iNumber = cin.nextInt();

        boolean bRet = nobj.ChkPresence(arr,iNumber);

        if(bRet==true)
        {
            System.out.println(iNo+" is present in array");
        }
        else
        {
            System.out.println(iNo+" is not present in array");
        }
    }
}
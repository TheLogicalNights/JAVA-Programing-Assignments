/*
    Problem Statement : Write java program which accept N numbers from user and accept
                        Range, Display all elements from that range

                        Input : N : 6
                                
                                Start : 60
                                End : 90

                                Elements : 85 66 3 76 93 88

                        Output : 66 76 88

                        Input : N : 6
                                
                                Start : 30
                                End : 50

                                Elements : 85 66 3 76 93 88

                        Output : 
*/

import java.util.*;

class Numbers
{
    void Display(int arr[],int iStart,int iEnd)
    {
        int iCnt = 0;
       for(iCnt=0;iCnt<arr.length;iCnt++)
       {
           if((arr[iCnt]>iStart) && (arr[iCnt]<iEnd))
           {
               System.out.print(arr[iCnt]+"\t");
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
        Numbers nobj = new Numbers();

        System.out.println("Enter how many numbers do you want");
        int iNo = cin.nextInt();

        int arr[] = new int[iNo];

        System.out.println("Enter numbers");
        for(int iCnt=0;iCnt<iNo;iCnt++)
        {
            arr[iCnt] = cin.nextInt();
        }

        System.out.println("Enter start of range");
        int iStart = cin.nextInt();

        System.out.println("Enter end of range");
        int iEnd = cin.nextInt();

        nobj.Display(arr,iStart,iEnd);    
    }
}
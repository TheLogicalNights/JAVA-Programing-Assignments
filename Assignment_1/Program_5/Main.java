/*
    Problem Statement : Write Java program which accept N numbers from user and display
                        all such elements which are multiples of 11.

                        Input : N : 6
                        Elements : 85 66 3 55 93 88

                        Output : 66 55 88
*/

import java.util.*;

class Numbers
{
    void Display(int arr[])
    {
        for(int iCnt=0;iCnt<arr.length;iCnt++)
        {
            if(((arr[iCnt]%11)==0))
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

        nobj.Display(arr);
    }
}
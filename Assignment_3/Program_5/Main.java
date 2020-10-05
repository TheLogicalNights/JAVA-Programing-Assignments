/*
    Problem Statement : Write java program which accept N numbers from user and return
                        product of all odd elements.
                        Input : N : 6
                        
                                Elements : 15 66 3 70 10 88

                        Output : 45

                        Input : N : 6

                                Elements : 44 66 72 70 10 88    

                        Output : 0
*/

import java.util.*;

class Numbers
{
    int OddProduct(int arr[])
    {
        int iCnt = 0;
        int iProduct = 1;
       for(iCnt=0;iCnt<arr.length;iCnt++)
       {
           if((arr[iCnt]%2)!=0)
           {
               iProduct = iProduct * arr[iCnt];
           }
       }
       if(iProduct==1)
       {
           return 0;
       }
       else
       {
            return iProduct;
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

        int iRet = nobj.OddProduct(arr);    

        System.out.println("Product of odd numbers is : "+iRet);
    }
}
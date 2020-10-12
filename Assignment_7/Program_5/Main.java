/*
    Problem Statement : Write Java program which accept string from user and display below pattern.
                
                        Input : Hello
                        Output : H
                                 H e
                                 H e l
                                 H e l l
                                 H l l l o
                                 H l l l
                                 H l l
                                 H l
                                 H
*/

import java.util.*;

class Pattern
{
    void Display(String str)
    {
        char arr[] = str.toCharArray();

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(arr[j]+"\t");
            }
            System.out.println();
        }
        for(int i=arr.length-1;i>=1;i--)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(arr[j]+"\t");
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

        System.out.println("Enter no of rows");
        String str = cin.nextLine();

        pobj.Display(str);
    }
}

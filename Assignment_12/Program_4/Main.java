/*
    Problem Statement : Write Java program which accept String from user and display
                        below pattern.

                        Input : Hello

                        Output : H e l l o
                                 H e l l #
                                 H e l # #
                                 H e # # #
                                 H # # # #
                                 H e # # #
                                 H e l # #
                                 H e l l #
                                 H e l l o
*/

import java.util.*;

class Pattern
{
    void Display(String str)
    {
        char arr[] = str.toCharArray();
        
        for(int i=arr.length-1;i>=0;i--)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(j<=i)
                {
                    System.out.printf(arr[j]+"\t");
                }
                else
                {
                    System.out.printf("#\t");
                }
            }
            System.out.println();
        }
        for(int i=1;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(j<=i)
                {
                    System.out.printf(arr[j]+"\t");
                }
                else
                {
                    System.out.printf("#\t");
                }
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

        System.out.println("Enter a string");
        String str = cin.nextLine();

        pobj.Display(str);
    }
}
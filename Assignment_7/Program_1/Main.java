/*
    Problem Statement : Write Java program which accept string from user and display below pattern.
                
                        Input : Hello
                        Output : H e l l o
                                 H e l l o
                                 H e l l o
                                 H e l l o
                                 H e l l o
*/

import java.util.*;

class Pattern
{
    void Display(String str)
    {
        char arr[] = str.toCharArray();

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
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

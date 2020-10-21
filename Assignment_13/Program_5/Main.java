/*
    Problem Statement : Write Java program which accept String from user and display
                        below pattern.

                        Input : Row=4 Column=4

                        Output : 1 2 3 4  
                                 1 2   4  
                                 1   3 4  
                                 1 2 3 4 
*/

import java.util.*;

class Pattern
{
    void Display(int iRow,int iCol)
    {
        for(int i=1;i<=iRow;i++)
        {
            for(int j=1;j<=iCol;j++)
            {
                if((i==1) || (j==1) || (j==iCol) || (i==iRow))
                {
                    System.out.printf(j+"\t");
                }
                else if(i==j)
                {
                    System.out.printf(j+"\t");
                }
                else
                {
                    System.out.printf(" \t");
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

        System.out.println("Enter number of rows");
        int iRow = cin.nextInt();

        System.out.println("Enter number of columns");
        int iCol = cin.nextInt();
        
        pobj.Display(iRow,iCol);
    }
}
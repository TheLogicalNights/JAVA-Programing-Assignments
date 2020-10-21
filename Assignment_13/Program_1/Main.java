/*
    Problem Statement : Write Java program which accept String from user and display
                        below pattern.

                        Input : Row=4 Column=4

                        Output : * * * #
                                 * * # *
                                 * # * *
                                 # * * *
*/

import java.util.*;

class Pattern
{
    void Display(int iRow,int iCol)
    {
        int iDec = iCol;
        for(int i=0;i<iRow;i++)
        {
            for(int j=0;j<iCol;j++)
            {
                if(j==iDec-1)
                {
                    System.out.printf("#\t");
                    iDec--;
                }
                else
                {
                    System.out.printf("*\t");
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
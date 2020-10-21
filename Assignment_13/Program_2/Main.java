/*
    Problem Statement : Write Java program which accept String from user and display
                        below pattern.

                        Input : Row=4 Column=4

                        Output : * * * #
                                 * * # @
                                 * # @ @
                                 # @ @ @
*/

import java.util.*;

class Pattern
{
    void Display(int iRow,int iCol)
    {
        for(int i=iRow;i>0;i--)
        {
            for(int j=0;j<iCol;j++)
            {
                if(j==i-1)
                {
                    System.out.printf("#\t");
                }
                else if(i-1<j)
                {
                    System.out.printf("@\t");
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
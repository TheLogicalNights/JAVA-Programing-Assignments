/*
    Problem Statement : Write Java program which accept number of rows and number of columns
                        from user and display below pattern.
                
                        Input : iRow = 4 iCol = 5
                        Output : 4 4 4 4 4 
                                 3 3 3 3 3
                                 2 2 2 2 2
                                 1 1 1 1 1
*/

import java.util.*;

class Pattern
{
    void Display(int iRow,int iCol)
    {
        for(int i=iRow;i>=1;i--)
        {
            for(int j=0;j<iCol;j++)
            {
                System.out.print(i+"\t");
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
        int iRow = cin.nextInt();

        System.out.println("Enter no of columns");
        int iCol = cin.nextInt();

        pobj.Display(iRow,iCol);
    }
}

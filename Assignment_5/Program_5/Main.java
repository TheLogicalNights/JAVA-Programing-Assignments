/*
    Problem Statement : Write Java program which accept number of rows and number of columns
                        from user and display below pattern.
                
                        Input : iRow = 3 iCol = 4
                        Output : 1  2  3  4
                                 5  6  7  8
                                 9 10 11 12
*/

import java.util.*;

class Pattern
{
    void Display(int iRow,int iCol)
    {
        int iNo = 1;
        for(int i=0;i<iRow;i++)
        {
            for(int j=0;j<iCol;j++)
            {
                System.out.print(iNo+"\t");
                iNo++;
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

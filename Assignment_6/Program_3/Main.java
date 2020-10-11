/*
    Problem Statement : Write Java program which accept number of rows and number of columns
                        from user and display below pattern.
                
                        Input : iRow = 3 iCol = 5
                        Output : 5 4 3 2 1
                                 5 4 3 2 1
                                 5 4 3 2 1
*/

import java.util.*;

class Pattern
{
    void Display(int iRow,int iCol)
    {
        int iNo = 0;
        for(int i=0;i<iRow;i++)
        {
            iNo = iCol;
            for(int j=0;j<iCol;j++)
            {
                System.out.print(iNo+"\t");
                iNo--;
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

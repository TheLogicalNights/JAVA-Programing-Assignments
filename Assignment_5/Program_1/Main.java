/*
    Problem Statement : Write Java program which accept number of rows and number of columns
                        from user and display below pattern.
                
                        Input : iRow = 4 iCol = 4
                        Output : A B C D
                        	 A B C D
                        	 A B C D
                        	 A B C D
*/

import java.util.*;

class Pattern
{
    void Display(int iRow,int iCol)
    {
        char ch = 'A';
        for(int i=0;i<iRow;i++)
        {
            ch = 'A';
            for(int j=0;j<iCol;j++)
            {
                System.out.print(ch+"\t");
            	ch++;
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

/*
    Problem Statement : Write Java program which accept number of rows and number of columns
                        from user and display below pattern.
                
                        Input : iRow = 4 iCol = 4
                        Output : A B C D
                                 a b c d
                                 A B C D
                                 a b c d
*/

import java.util.*;

class Pattern
{
    void Display(int iRow,int iCol)
    {
        char ch;
        for(int i=0;i<iRow;i++)
        {
            if((i%2)==0)
            {
                ch = 'A';
            }
            else
            {
                ch = 'a';
            }
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
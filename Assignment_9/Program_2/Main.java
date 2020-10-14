/*
    Problem Statement : Write a program which accept matrix and one number from user and return
                        frequency of that number.

                        Input : Number : 9
                                3 2 5 9
                                4 3 2 2 
                                8 4 1 9 
                                3 9 7 5 
                        Output : 3
*/
import java.util.*;

class Matrix
{
    int Frequency(int matrix[][],int iNo)
    {
        int iFreq = 0;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                if(matrix[i][j]==iNo)
                {
                    iFreq++;
                }
            }
        }
        return iFreq;
    }
}

class Main
{
    public static void main(String args[])
    {
        Scanner cin = new Scanner(System.in);
        Matrix mobj = new Matrix();

        System.out.println("Enter number of rows");
        int iRow = cin.nextInt();
        System.out.println("Enter number of columns");
        int iCol = cin.nextInt();

        int matrix[][] = new int[iRow][iCol];

        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                System.out.println("Enter "+i+","+j+" element");
                matrix[i][j] = cin.nextInt();
            }
        }

        System.out.println("Enter number whos frequency do you want to count");
        int iNo = cin.nextInt();

        int iRet = mobj.Frequency(matrix,iNo);

        System.out.println("Frequency of "+iNo+" is : "+iRet);
    }
}
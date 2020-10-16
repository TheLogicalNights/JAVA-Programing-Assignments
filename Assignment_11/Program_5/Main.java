/*
    Problem Statement : Write a java program which accept matrix from user and return
                        addition of border elements of matrix.
*/
import java.util.*;
import java.lang.*;

class Matrix
{
    int AddBorder(int matrix[][],int iRow,int iCol)
    {
        int iSum = 0;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                if((i==0) || (j==0) || (i==iRow-1) || (j==iCol-1))
                {
                    iSum = iSum + matrix[i][j]; 
                }
            }
            System.out.println();
        }
        return iSum;
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

        int iRet = mobj.AddBorder(matrix,iRow,iCol);

        System.out.println("Summation of border elements is :"+iRet);
        
    }
}
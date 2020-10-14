/*
    Problem Statement : Write a program which accept matrix and display addition of elements From each
                        column.

                        Input : 
                                3 2 5 9
                                4 3 2 2 
                                8 4 1 9 
                                3 9 7 5 
                        Output : 18 18 15 25
*/
import java.util.*;

class Matrix
{
    int[] SumOfColums(int matrix[][],int iCol)
    {
        int iAdd[] = new int[iCol]; 
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                iAdd[j] = iAdd[j] + matrix[i][j];
            }
        }
        
        return iAdd;
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

        int iRet[] = mobj.SumOfColums(matrix,iCol);

        for(int k=0;k<iCol;k++)
        {
            System.out.printf(iRet[k]+"\t");
        }
        System.out.println();
    }
}
/*
    Problem Statement : Write a program which accept matrix and reverse the contents of each row.

                        Input : 
                                3 2 5 9
                                4 3 2 2 
                                8 4 1 5 
                                3 9 7 5 
                        Output : 9 5 2 3
                                 2 2 3 4
                                 5 1 4 8
                                 5 7 9 3
*/
import java.util.*;

class Matrix
{
    int[][] ReverseRow(int matrix[][],int iRow,int iCol)
    {
        int iTemp = 0;

        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0,k=matrix[i].length-1;j<k;j++,k--)
            {
                iTemp = matrix[i][j];
                matrix[i][j] = matrix[i][k];
                matrix[i][k] = iTemp;
            }
        }
        return matrix;
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

        int iRet[][] = mobj.ReverseRow(matrix,iRow,iCol);

        if(iRet[0][0]!=-1)
        {   
            for(int i=0;i<matrix.length;i++)
            {
                for(int j=0;j<matrix[i].length;j++)
                {
                    System.out.printf(matrix[i][j]+"\t");
                }
                System.out.println();
            }
        }
    }
}
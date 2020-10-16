/*
    Problem Statement : Write a program which accept matrix and swap the contents of consecutive columns.

                        Input : 
                                3 2 5 9
                                4 3 2 2 
                                8 4 1 9 
                                3 9 7 5 
                        Output : 2 3 9 5
                                 3 4 2 2
                                 4 8 9 1
                                 9 3 5 7
*/
import java.util.*;

class Matrix
{
    int[][] SwapColumn(int matrix[][],int iRow,int iCol)
    {
        int err[][] = new int[1][1];
        err[0][0] = -1;
        if((iCol%2)!=0)
        {
            return err;
        }
        int iTemp = 0;  

        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j=j+2)
            {
                if((j%2)==0)
                {
                    iTemp = matrix[i][j];
                    matrix[i][j] = matrix[i][j+1];
                    matrix[i][j+1] = iTemp;
                }
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

        int iRet[][] = mobj.SwapColumn(matrix,iRow,iCol);

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
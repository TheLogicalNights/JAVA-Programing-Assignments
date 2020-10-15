/*
    Problem Statement : Write a program which accept matrix from user and display transpose of the
                        matrix.

                        The transpose of a given matrix is formed by interchanging the rows and
                        columns of a matrix.

                        Input : 
                                3 2 5 9
                                4 3 2 2 
                                8 4 1 5 
                                3 9 7 5 
                        Output : 3 4 8 3 
                                 2 3 4 9
                                 5 2 1 7 
                                 9 2 5 5
*/
import java.util.*;

class Matrix
{
    int[][] Transpose(int matrix[][],int iRow,int iCol)
    {
        int err[][] = new int[1][1];
        err[0][0] = -1;
        if(iRow!=iCol)
        {
            return err;
        }
        int iTemp = 0;

        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                if((i!=j) && (i<j))
                {
                    iTemp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = iTemp;
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

        int iRet[][] = mobj.Transpose(matrix,iRow,iCol);

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
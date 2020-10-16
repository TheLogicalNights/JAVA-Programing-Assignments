/*
    Problem Statement : Write a program which accept matrix and swap the contents of consecutive rows.

                        Input : 
                                3 2 5 9
                                4 3 2 2 
                                8 4 1 9 
                                3 9 7 5 
                        Output : 4 3 2 2 
                                 3 2 5 9
                                 3 9 7 5 
                                 8 4 1 9
*/
import java.util.*;

class Matrix
{
    int[][] SwapRow(int matrix[][],int iRow,int iCol)
    {
        int err[][] = new int[1][1];
        err[0][0] = -1;
        if((iRow%2)!=0)
        {
            return err;
        }
        int iTemp1[] = new int[iCol];
        int iTemp2[] = new int[iCol];

        for(int i=0;i<matrix.length;i=i+2)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                if((i%2)==0)
                {
                    iTemp1[j] = matrix[i][j];
                    iTemp2[j] = matrix[i+1][j];
                    matrix[i][j] = iTemp2[j];
                    matrix[i+1][j] = iTemp1[j];
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

        int iRet[][] = mobj.SwapRow(matrix,iRow,iCol);

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
/*
    Problem Statement : Write a java program which accept matrix from user and trace and
                        normal of given matrix.Here trace of the matrix is the sum of the
                        elements of the main diagonal i.e the diagonal from the upper left to
                        the lower right of a matrix. Normal of the matrix is the square root of
                        the sum of all the elements.
*/
import java.util.*;
import java.lang.*;

class Matrix
{
    double[] TraceNormal(int matrix[][],int iRow,int iCol)
    {
        double Err[] = new double[1];
        Err[0] = -1;
        if(iRow!=iCol)
        {
            return Err;
        }
        int iTrace = 0;
        double iNormal = 0;
        double iResult[] = new double[2];

        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                if(i==j)
                {
                    iTrace = iTrace + matrix[i][j]; 
                }
            }
        }
        iNormal = Math.sqrt(iTrace);
        iResult[0] = iTrace;
        iResult[1] = iNormal;
        return iResult;
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

        double iRet[] = mobj.TraceNormal(matrix,iRow,iCol);

        if(iRet[0]!=-1)
        {   
            System.out.println("Trace of matrix is :"+iRet[0]);
            System.out.println("Normal of matrix is :"+iRet[1]);
        }
        else
        {
            System.out.println("Error:No of rows and columns should be same...");
        }
    }
}
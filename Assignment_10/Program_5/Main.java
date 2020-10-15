/*
    Problem Statement : Write a program which accept matrix and check whether the matrix is
                        Sparse matrix or not.
                        
                        Sparse matrix is a matrix with the majority of its elements equal to zero.
                        
                        Input : 
                                1 0 3 0
                                0 6 0 0 
                                0 0 1 0
                                9 0 0 9
                        
                        Output : True
*/
import java.util.*;

class Matrix
{
    boolean IsSparse(int matrix[][],int iRow,int iCol)
    {
        int iZeroCnt = 0;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                if(matrix[i][j]==0)
                {
                    iZeroCnt++;
                }
            }
            
        }
        int iTotalElementCnt = iRow * iCol;
        if((iZeroCnt)>(iTotalElementCnt/2))
        {
            return true;
        }
        else
        {
            return false;
        }
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

        boolean iRet = mobj.IsSparse(matrix,iRow,iCol);

        if(iRet==true)
        {
            System.out.println("It is a sparse matrix");
        }
        else
        {
            System.out.println("It is not a sparse matrix");
        }
    }
}
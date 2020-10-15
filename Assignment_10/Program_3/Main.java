/*
    Problem Statement : Write a program which accept matrix and reverse the contents of each
                        column.

                        Input : 
                                3 2 5 9
                                4 3 2 2 
                                8 4 1 9 
                                3 9 7 5 
                        Output : 3 9 7 5
                                 8 4 1 9
                                 4 3 2 2 
                                 3 2 5 9
*/
import java.util.*;

class Matrix
{
    int[][] ReverseColumn(int matrix[][],int iRow,int iCol)
    {
        int iTemp = 0;
        
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                if((i<=(matrix.length-i-1)))
                {
                    iTemp = matrix[i][j];
                    matrix[i][j] = matrix[matrix.length-i-1][j];
                    matrix[matrix.length-i-1][j] = iTemp;
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

        int iRet[][] = mobj.ReverseColumn(matrix,iRow,iCol);

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

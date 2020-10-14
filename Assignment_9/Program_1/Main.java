/*
    Problem Statement : Write a program which accept matrix from user and return addition of diagonal
                        elements.

                        Input : 3 2 5 9
                                4 3 2 2 
                                8 4 1 5
                                3 9 7 5

                        Output : 12
*/
import java.util.*;

class Matrix
{
    int SumOfDiagonal(int matrix[][])
    {
        int iSum = 0;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                if(i==j)
                {
                    iSum = iSum + matrix[i][j];
                }
            }
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

        int iRet = mobj.SumOfDiagonal(matrix);

        System.out.println("Sum of diagonal element is : "+iRet);
    }
}
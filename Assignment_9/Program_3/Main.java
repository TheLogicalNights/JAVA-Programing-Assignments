/*
    Problem Statement : Write a program which accept matrix and return largest number from both the
                        diagonals

                        Input : 3 2 5 9
                                4 3 2 2 
                                8 4 1 9 
                                3 9 7 5 
                        
                        Output : 9 

*/
import java.util.*;

class Matrix
{
    int LargestInBothDiagonals(int matrix[][])
    {
        int iMax = 0;
        int iDec = 1;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                if(i==j)
                {
                    if(matrix[i][j]>iMax)
                    {
                        iMax = matrix[i][j];
                    }
                }
                if((j==matrix[i].length-iDec))
                {
                    if(matrix[i][j]>iMax)
                    {
                        iMax = matrix[i][j];
                    }
                    iDec++;   
                }
            }
        }
        return iMax;
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

        int iRet = mobj.LargestInBothDiagonals(matrix);
        System.out.println("Largest number from the both diagonals is "+iRet);
    }
}
/*
    Problem Statement : Write a program which accept matrix and check whether the matrix is
                        identity matrix or not.

                        Identity matrix is a square matrix with 1’s along the diagonal from upper left to
                        lower right and 0’s in all other positions.
                        If it satisfies the structure as explained before then the matrix is called as
                        identity matrix.
                        
                        Input : 
                                1 0 0 0
                                0 1 0 0 
                                0 0 1 0
                                0 0 0 1 
                        
                        Output : True
*/
import java.util.*;

class Matrix
{
    boolean IsIdentity(int matrix[][],int iRow,int iCol)
    {
        int i = 0, j = 0;
        if(iRow!=iCol)
        {
            return false;
        }
        for(i=0;i<matrix.length;i++)
        {
            for(j=0;j<matrix[i].length;j++)
            {
                if(i==j)
                {
                    if((matrix[i][j])!=1)
                    {
                        break;
                    }
                }
                else
                {
                    if((matrix[i][j])!=0)
                    {
                        break;
                    }
                }
            }
            if(j<matrix[i].length)
            {
                break;
            }
        }
        if(i<matrix.length)
        {
            return false;
        }
        else
        {
            return true;
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

        boolean iRet = mobj.IsIdentity(matrix,iRow,iCol);

        if(iRet==true)
        {
            System.out.println("It is an identity matrix");
        }
        else
        {
            System.out.println("It is not an identity matrix");
        }
    }
}

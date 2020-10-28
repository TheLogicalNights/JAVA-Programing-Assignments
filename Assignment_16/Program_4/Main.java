/*
    Problem Statement : Write java program which accept marks of N students from user
                        and display class of each student.
                        Less than 35 - Fail
                        Less than 50 - Pass class
                        Less than 60 - Second class
                        Less than 70 - First class
                        Greater than 70 - First class with Distinction
*/

import java.util.*;

class Array
{
    void Result(float arr1[])
    {
        int i = 0;
        for(i=0;i<arr1.length;i++)
        {
            if((arr1[i]<35.00))
            {
                System.out.println("Marks : "+arr1[i]+" Result : Fail");
            }
            else if((arr1[i]<50.00))
            {
                System.out.println("Marks : "+arr1[i]+" Result : Pass class");
            }
            else if((arr1[i]<60.00))
            {
                System.out.println("Marks : "+arr1[i]+" Result : Second class");
            }
            else if((arr1[i]<70.00))
            {
                System.out.println("Marks : "+arr1[i]+" Result : First class");
            }
            else
            {
                System.out.println("Marks : "+arr1[i]+" Result : First with distinction");
            }
        }  
    }
}

class Main
{
    public static void main(String args[])
    {
        Scanner cin = new Scanner(System.in);
        Array aobj = new Array();

        System.out.println("How many students do you want ?");
        int iNo1 = cin.nextInt();

        float arr1[] = new float[iNo1];

        System.out.println("Enter the marks of students");
        for(int i=0;i<iNo1;i++)
        {
            arr1[i] = cin.nextFloat();
        }
        aobj.Result(arr1);

    }
}
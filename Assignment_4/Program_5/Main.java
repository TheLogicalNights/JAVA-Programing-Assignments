/*
    Problem Statement : Write a java program which accept string from user and display
                    it in reverse order.
                    
                    Input : “MarvellouS”
                    Output : “SuollevraM”
*/ 

import java.util.*;

class StringOperation
{
    void DisplayReverse(String str)
    {
        for(int iCnt=(str.length())-1;iCnt>=0;iCnt--)
        {
            System.out.print(str.charAt(iCnt));
        }
        System.out.println();
    }
}

class Main
{
    public static void main(String args[])
    {
        Scanner cin = new Scanner(System.in);

        System.out.println("Enter a string");
        String str = cin.nextLine();

        StringOperation sobj = new StringOperation();

        sobj.DisplayReverse(str);
   }
}
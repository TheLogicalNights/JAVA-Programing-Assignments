/* 
    Problem Statement : Write a java program which accepts 2 strings from user and
                        concat N characters of second string after first string.Value of N
                        should be accepted from user.
                        Note : If third parameter is greater than the size of second string
                               then concat whole string after first string.

                        Input : “Marvellous Infosystems”
                                “Logic Building”
                                5

                        Output : “Marvellous Infosystems Logic”
*/

import java.util.*;

class StringDemo
{
    void StrCat(String str1,String str2,int iNo)
    {
        int iSize1 = (str1.length()+1);
        int iSize2 = str2.length();

        int iSize3 = ((str1.length()) + iNo+1);

        char s1[] = new char[iSize3];
        char s2[] = str2.toCharArray();

        for(int i=0;i<str1.length();i++)
        {
            s1[i] = str1.charAt(i);
        }

        for(int i=0;i<iNo;i++)
        {
            s1[iSize1] = s2[i];
            iSize1++;
        }
        System.out.println("String after concatination is :");
        System.out.println(s1);
    }
}
class Main
{
    public static void main(String args[])
    {
        Scanner cin = new Scanner(System.in);
        StringDemo sobj = new StringDemo();

        System.out.println("Enter first string");
        String str1 = cin.nextLine();
        System.out.println("Enter second string");
        String str2 = cin.nextLine();

        System.out.println("Enter a number");
        int iNo = cin.nextInt();

        sobj.StrCat(str1,str2,iNo);
    }
}
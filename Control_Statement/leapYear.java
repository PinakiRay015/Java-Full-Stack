//java program to check weather an year is leap year or not
package Control_Statement;

import java.util.Scanner;

public class leapYear {
    public static boolean checkLeapYear(int year)
    {
        boolean ans = (year % 400 == 0 || year%4==0 && year%100!=0) ? true : false;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = sc.nextInt();
        if(checkLeapYear(year))
        {
            System.out.println("Leap year");
        }
        else
        {
            System.out.println("Not a leap year");
        }
    }
}

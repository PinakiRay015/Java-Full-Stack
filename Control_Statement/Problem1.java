package Control_Statement;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] agrs)
    {
        Scanner sc = new Scanner(System.in);
        int [] myArray = new int[20];
        System.out.println("Enter the numbers from 1 to 20");
        int temp = 0;
        for(int nums : myArray)
        {
            myArray[temp] = sc.nextInt();
            temp++;
        }

        for(int i=0 ; i<myArray.length ; i++)
        {
            if(myArray[i]%3==0 && myArray[i]%5==0)
            {
                System.out.print(" FizzBuzz");
            }
            else if(myArray[i]%3==0)
            {
                System.out.print(" Fizz");
            }
            else if(myArray[i]%5==0)
            {
                System.out.print(" Buzz");
            }

            else
            {
                System.out.print(" "+myArray[i]);
            }
        }
    }
}

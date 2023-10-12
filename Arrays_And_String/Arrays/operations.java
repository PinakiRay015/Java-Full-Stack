//java program to perform sorting , reversing and getting smallest and largest element from an array
package Arrays_And_String.Arrays;

import java.util.Arrays;

public class operations {
    public static void reverseArray(int []array)
    {
        for(int i=0 ; i<array.length/2; i++)
        {
            int temp = array[i];
            array[i] = array[array.length-i-1];
            array[array.length-i-1] = temp;
        }
    }

    public static void largest_And_SmallestElement(int []array)
    {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0 ; i<array.length ; i++)
        {
            largest = Math.max(array[i] , largest);
            smallest = Math.min(smallest , array[i]);
        }

        System.out.println("Largest element of an Array is "+largest+" and smallest is "+smallest);
    }
    public static void main(String[] args) {
        int []myArray = {10 , 2 , 34 , 33 , 67 , 92 , 12, 18};
        System.out.println("Array before reverse "+Arrays.toString(myArray));

        reverseArray(myArray);         //Reversing an array
        System.out.println("Arrays after reversing "+Arrays.toString(myArray));
        largest_And_SmallestElement(myArray);       //Getting smallest and largest element from an array
        Arrays.sort(myArray);       //sorting an array
        System.out.println("After sorting all the elements "+Arrays.toString(myArray));
    }
}

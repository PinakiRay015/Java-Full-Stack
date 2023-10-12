package Variables_and_DataTypes;

public class typeCast {
    public static void main(String[] args) {
        float num2 = 12.56f;

        System.out.println(num2);         //This will print the fractional number 12.56 as usual.
        System.out.println((int)num2);    //This will ignore the numbers after decimal point as we type cast to int from float
    }
}

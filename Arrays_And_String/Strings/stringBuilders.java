package Arrays_And_String.Strings;

public class stringBuilders {
    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder("Pinaki");
        System.out.println(sb);
        sb.append(" sankar"); //Adding (concatenating) a new string to the existing string
        System.out.println(sb);

        sb = new StringBuilder("Hello developers");
        System.out.println(sb); //updating the complete string
    }
}

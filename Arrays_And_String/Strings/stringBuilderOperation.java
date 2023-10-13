package Arrays_And_String.Strings;

public class stringBuilderOperation {
    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder("pinaki");

        sb.append(" rohan"); //adding string or character at the end of the string
        System.out.println(sb);

        sb.insert(6 , " and"); //adding string or character at a particular position of the string
        System.out.println(sb);

        sb.delete(7 , 10); // delete the string or character from starting index to ending index
        System.out.println(sb);

        sb.reverse();   //reversing all the characters of the string
        System.out.println(sb);

    }
}

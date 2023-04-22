import java.util.Scanner;
public class StringMethods{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println("Character at index 2: "+str.charAt(2));
        System.out.println("Substring: "+str.substring(0, 4));
        str = str.concat("kumar");
        System.out.println("Length of the string: "+str.length());
        System.out.println("String in lowercase: "+str.toLowerCase());
        System.out.println("String in uppercase: "+str.toUpperCase());
        System.out.println(str.equals("pravinkumar"));
        System.out.println(str.contains("i"));
    }
}

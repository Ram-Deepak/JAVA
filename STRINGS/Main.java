import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    System.out.println(str.charAt(2));
    System.out.println("The length of the string is "+str.length());
    System.out.println(str.substring(0,3));
    System.out.println(str.indexOf('a'));
    System.out.println(str.equals("ramdeepak"));
    System.out.println(str.isEmpty());
    System.out.println(str.toLowerCase());
    System.out.println(str.toUpperCase()); 
  }
}
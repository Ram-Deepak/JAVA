import java.util.*;
public class Lambda{
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=1; i<=5; i++)
            arr.add(i);
        arr.forEach((n) -> {System.out.println(n);});
    }
}
import java.util.ArrayList;
public class lambda{
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.forEach((n) -> {System.out.println(n);});
    }
}

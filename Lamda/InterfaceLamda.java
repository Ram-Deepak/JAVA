import java.util.ArrayList;
import java.util.function.Consumer;

public class InterfaceLamda{
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=1; i<=5; i++){
            arr.add(i);
        }
        //Interface with only one method
        Consumer<Integer> method = (n) -> {System.out.println(n);};
        arr.forEach(method);
    }
}
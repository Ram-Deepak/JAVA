import java.util.*;
public class AList{
    public static void main(String[] args){
        ArrayList<String> al = new ArrayList<>();
        al.add("Raj");
        al.add("Ravi");
        al.add("Ram");
        Iterator<?> itr = al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
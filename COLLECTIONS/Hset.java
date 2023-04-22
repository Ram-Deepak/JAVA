import java.util.HashSet;

public class Hset{
    public static void main(String[] args){
        HashSet<Integer> set = new HashSet<>();
        for(int i=1; i<=5; i++){
            set.add(i);
        }
        System.out.println(set);
        System.out.println(set.size());
    }
}
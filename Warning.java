import java.util.ArrayList;
public class Warning{
    @SuppressWarnings("unchecked")
    public static void main(String[] args){
        ArrayList list = new ArrayList();
        list.add("Jayanth");
        list.add("Gowreesh");
        list.add("Bagavathi");
        list.add("Thaadi");
        
        for(Object obj : list){
            System.out.println(obj);
        }
    }
}

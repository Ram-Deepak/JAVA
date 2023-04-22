import java.util.Stack;

public class StackCollection{
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        for(int i=1;i<=5;i++){
            st.push(i);
        }
        System.out.println(st);
        st.pop();
        Iterator<Integer> it = st.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
import java.util.Stack;
//Sarveshwaran R;
public class day1 {
    public static void main(String... args){
        Stack<String> st=new Stack<String>();
        st.push("Maruti");
        st.push("Minecraft");
        st.push("Nina");
        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.search("Minecraft"));
    }    
}

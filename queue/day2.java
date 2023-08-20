import java.util.*;
public class day2 {
    public static void main(String... args){
        Queue<String> q=new LinkedList<String>();
        System.out.println(q.isEmpty());
        q.offer("Karen");
        q.offer("chad");
        q.offer("Steve");
        q.offer("Harold");
        System.out.println(q.contains("Karen"));
        System.out.println(q.poll());
        System.out.println(q.size());
        System.out.println(q.isEmpty());
        System.out.println(q.contains("Karen"));
        System.out.println(q);
   }    
}


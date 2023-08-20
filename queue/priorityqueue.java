import java.util.*;
public class priorityqueue {
    public static void main(String... args){
        Queue<String> q = new PriorityQueue<String>(Collections.reverseOrder());
        q.offer("Spongebob");
        q.offer("Patrick");
        q.offer("Sandy");
        q.offer("Mr Krabs");
        while(!q.isEmpty()){
            System.out.println(q.poll());
        }
    }
}

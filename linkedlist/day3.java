import java.util.*;
public class day3 {
    public static void main(String... args){
        LinkedList<String> ls=new LinkedList<String>();
        ls.push("a");
        ls.push("b");
        ls.push("c");
        ls.push("d");
        ls.push("f");
        ls.offer("z");
        ls.add(1,"e");
        ls.addLast("y");
        ls.addFirst("g");
        ls.pop();
        ls.poll();
        ls.remove("b");
        ls.removeFirst();
        ls.removeLast();
        String str =ls.toString();
        System.out.println(str.toCharArray());
    }    
}

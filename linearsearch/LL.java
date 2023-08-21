class node{
    public String data;
    node next;
    node(String data){
        this.data=data;
        next=null;
    }
}
public class LL {
    public static void main(String... args){
        node head=null;
        head=new node("213");
        System.out.print(head.data);
    }
}

import org.w3c.dom.Node;

class node{
    public String data;
    node next;
    node(String data){
        this.data=data;
        next=null;
    }
}
public class LL{
    node head=null,tail=null;
    public void addlast(String data){
    node newnode=new node(data);
        if(head==null){
            newnode.next=null;
            head=newnode;
            tail=newnode;
        }
        else{
            newnode.next=null;
            tail.next=newnode;
            tail=newnode;
        }
    }
    public void addfirst(String data){
        node newnode=new node(data);
        if(head==null){
            newnode.next=null;
            head=newnode;
            tail=newnode;
        }
        else{
            newnode.next=head;
            head=newnode;
        }
    }
    public void deletefirst(){
        if(head==null){
            System.out.println("The linked list is empty");
        }
        if(head==tail){
            head=null;
            tail=null;
        }
        else{
            head=head.next;
        }
    }
    public void deletelast(){
        if(head==null){
            System.out.println("The linked list is empty");
        }
        else if(head==tail){
            head=null;
            tail=null;
        }
        else{
            node prev = head;
            while (prev.next != tail) {
                prev = prev.next;
            }
            prev.next = null;
            tail = prev;
        }
    }
    public void disp(){
        node ptr=head;
        while(ptr.next!=null){
            System.out.printf("%s->",ptr.data);
            ptr=ptr.next;
        }
        System.out.println(ptr.data);
    }
    public static void main(String... args){
        LL list=new LL();
        list.addlast("test");
        list.addfirst("is");
        list.addfirst("This");
        list.disp();
        list.deletefirst();
        list.disp();
        list.deletelast();
        list.deletefirst();
        list.disp();
    }
}

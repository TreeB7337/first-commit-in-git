import java.util.*;
public class day4 {
    public static void main(String... args){
        DynamicArray dy= new DynamicArray();
        dy.add("A");
        dy.add("B");
        dy.add("C");
        dy.add("E");
        dy.insert(3,"D");
        System.out.println("index: "+dy.search("E"));
        System.out.println("array: "+dy);
        System.out.println("size: "+dy.size);
        System.out.println("capacity: "+dy.capacity);
    }    
}
// hello
class DynamicArray{
    int capacity=10;
    Object[] arr;
    int size;
    public DynamicArray(){
        this.arr=new Object[capacity];
    }
    public DynamicArray(int capacity){
        this.capacity=capacity;
        this.arr=new Object[capacity];
    }
    public void add(Object data){
        if(size>=capacity){
            grow();
        }
        arr[size]=data;
        size++;
    }
    public void insert(int index, Object data){
        if(size>=capacity){
            grow();
        }
        for(int i=size;i>index;i--){
            arr[i]=arr[i-1];
        }
        arr[index]=data;
        size++;
    }
    public void delete(Object data){
        for(int i=0;i<size;i++){
            if(arr[i]==data){
                for(int j=0;j<size-i-1;j++){
                    arr[i+j]=arr[i+j+1];
                }
                arr[size-1]=null;
                size--;
                break;
            }
        }
    }
    public int search(Object data){
        for(int i=0;i<size;i++){
            if(arr[i]==data){
                return i;
            }
        }
        return -1;
    }
    public boolean isEmpty(){
        return size==0;
    }
    private void grow(){

    }
    private void shrink(){

    }
    public String toString(){
        String x="";
        for(int i=0;i<capacity;i++){
            x+=arr[i]+",";
        }
        if(x!=""){
            x="["+x.substring(0,x.length()-1)+"]"; 
        }
        else{
            x="[]";
        }
        return x;
    }
}

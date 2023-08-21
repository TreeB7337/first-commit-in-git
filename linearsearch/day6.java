import java.util.Scanner;
public class day6 {
    public static void main(String[] args){
        int[] arr={3,2,5,1,8,0,4,7,6,9};
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int index=linearsearch(arr, x);
        if(index!=-1){
            System.out.println(index);
        }
        else{
            System.out.println("Element not found");
        }
    }
    public static int linearsearch(int[] arr, int n){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                return i;
            }
        }
        return -1;
    }
}

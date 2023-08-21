import java.util.*;
public class day7 {
    public static void main(String... args){
        int[] arr= new int[1000000];
        for(int i=0;i<arr.length;i++){
            arr[i]=i+1;
        }
        //int index=Arrays.binarySearch(arr,100);
        //System.out.println(index);
        int key=777777;
        int index=binarySearch(arr,key);
    }
    public static int binarySearch(int[] arr,int key){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int middle=low+(high-low)/2;
            System.out.println(arr[middle]);
            if(key>arr[middle]){
                low=middle+1;
            }
            else if(key<arr[middle]){
                high=middle-1;
            }
            else if(key==arr[middle]){
                return middle;
            }
        }
        return -1;
    }
}

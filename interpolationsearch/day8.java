import java.util.*;
public class day8 {
    public static void main(String... args){
        int[] arr={1,2,3,4,5,6,7,8,9};
        int index=interpolationsearch(arr,9);
        System.out.println(index);
    }
    public static int interpolationsearch(int[] arr, int key){
        int low=0;
        int high=arr.length-1;
        while(key>=arr[low] && key<=arr[high] && low<=high){
            int probe= low+ ((high-low)*(key-arr[low]))/(arr[high]-arr[low]);
            System.out.println("probe: "+probe);
            if(arr[probe]==key){
                return probe;
            }
            else if(arr[probe]<key){
                low=probe+1;
            }
            else if(arr[probe]>key){
                high=probe-1;
            }
        }
        return -1;
    }
} 

public class day11 {
    public static void main(String... args){
        int[] arr={9,3,5,1,8,6,2,4,7,0};
        insertionsort(arr);
        for(int i:arr){
            System.out.print(i);
        }
    }    
    public static void insertionsort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int j=i-1;
            int temp=arr[i];
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }
}

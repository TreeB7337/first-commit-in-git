public class day10{
    public static void main(String... args){
        int[] arr={9,3,5,1,2,8,7,6,0,4};
        selection(arr);
        for(int i:arr){
            System.out.print(i);
        }
    }
    public static void selection(int[] arr){
        for(int i=0;i<arr.length;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }
}
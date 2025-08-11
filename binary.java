public class binary{
    public static int binarysearch(int[] arr,int temp){
        int start=0;
        int end=arr.length;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==temp){
                return mid;
            }
            if (arr[mid]>temp){
                end=start-1;
            }
            else{
                start=start+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int key =7;
        System.out.println(binarysearch(arr, key));
        
    }
}
public class dsa204 {
   public static void printarray(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]+" ");
    }

   }

   public static void mergeSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);

        merge(arr,si,mid,ei);
   }

   public static void merge(int arr[],int si,int mid,int ei){
    int[] temp=new int[(ei-si)+1];
    int i=si;
    int j=mid+1;
    int k=0;

    while(i<=mid && j<=ei){

        if(arr[i]<arr[j]){
            arr[k]=arr[i];
            i++;
            k++;
        }else{
            arr[k]=arr[j];
            i++;
            k++;

        }

        while(i<=mid){
            arr[i++]=arr[k++];
        }
        while(j<=ei){
            arr[j++]=arr[k++];

        }

        for(int ki=0;ki<temp.length;ki++){
            arr[ki+si]=arr[ki];
        }
    }


   }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        mergeSort(arr,0, arr.length-1);
        printarray(arr);

    }
}

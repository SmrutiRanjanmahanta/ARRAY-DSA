public class subarray {
    public static void main(String[] args) {
        int[] arr={2,4,6,8,10};
        
        for(int i=0;i<arr.length;i++){
            int star=i;
            for(int j=i;j<arr.length;j++){
               int sum=0;
                for(int k=i;k<=j;k++){
                    sum=sum+arr[k];
                    System.out.print(arr[k]+" " +" = "+sum+"   ");
                    
                }
                System.out.println();
                
            }
            System.out.println();
            
        }
    }
}

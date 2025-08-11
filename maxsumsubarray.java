public class maxsumsubarray {
    public static void main(String[] args) {
        int [] arr={2,4,6,8,10};
        int max=arr[0];
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                sum=0;
                for(int k=i;k<=j;k++){
                    sum=sum+arr[k];
                }
                System.out.println("the current sum is::"+sum);
                if(sum>max){
                    max=sum;
                }
            }

        }
        System.out.println("the max sum is:::"+max);
    }
}

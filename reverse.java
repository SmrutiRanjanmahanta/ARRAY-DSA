public class reverse{
    public static void revrse(int num[]){
        int n=num.length;
        int result[]=new int[num.length];
        int t=num.length-1;
        for(int i=0;i<n;i++){
            result[t]=num[i];
            t--;
        }
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
        
    }
    public static void main(String[] args) {
        int[] num={2,5,8,9,10,14};
        revrse(num);
    }
}
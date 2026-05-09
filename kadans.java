public class kadans {
    public static void main(String[] args) {
        int ms=Integer.MIN_VALUE;
        int cs=0;
        int[] arr={-1};
        for(int i=0;i<arr.length;i++){
            cs=cs+arr[i];
             if (cs>ms){
                ms=cs;
            }
            if(cs<0){
                cs=0;
            }
           
        }
        System.out.println(ms);
    }
}

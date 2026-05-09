public class maxsubarry3 {
    public static void main(String[] args) {
        int[] arr={2,5,7,9,10,23};
        int[] prifixarr=new int[arr.length];
        prifixarr[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prifixarr[i]=prifixarr[i-1]+arr[i];
        }
for (int index = 0; index < prifixarr.length; index++) {
    System.out.println(index);
    
}
    }
}

public class sortedrotated {
    public static int sorted(int arr[],int target,int si,int ei){
        if(si>ei){
            return -1;
        }

        int mid=si+(ei-si)/2;

        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]<target){
            if(arr[si]<= target&&target<arr[mid]){
                return sorted(arr, target, si, mid) ;
            }
            else{
                return sorted(arr, target, mid+1, ei) ;
            }
        }
        else{
            if(arr[mid+1]<=target&& target<=arr[ei]){
                return sorted(arr, target, mid+1, ei);
            }else{
                return sorted(arr, target, si, mid-1);
            }
        }
    }


    public static void main(String[] args) {
        int arr[]={3,4,5,0,1,2};
        int ind=sorted(arr, 0, 0, arr.length-1);
        System.out.println(ind);
    }
}

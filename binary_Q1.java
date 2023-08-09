import java.util.*;

public class binary_Q1 {
    public static void main(String[] args) {
        int[] arr={2,3,5,7,9,13};

        int target=7;

        int s=0;
        int e=arr.length-1;

        for(int i=0;i<arr.length;i++){
            int m=(s+e)/2;
            if(target==arr[m]){
                s=m;
                break;
            }
            if(target<arr[m]){
                e=m-1;
            }else{
                s=m+1;
            }
        }
        //just a greater to the target or equal to the target
        System.out.println(s);

      //and for --> just a smaller to the target or equal to the target
      //System.out.println(e);
    }
}

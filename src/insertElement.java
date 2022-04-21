
import java.util.Arrays;
public class insertElement {
    public static void main(String[] args) {
        int[]arr={4,5,7,9,2,1};
        int idx=3;
        int value=11;
        System.out.println(Arrays.toString(arr));

        for(int i=arr.length-1;i>idx;i--){
            arr[i]=arr[i-1];
        }
        arr[idx]=value;
        System.out.println(Arrays.toString(arr));
    }
}

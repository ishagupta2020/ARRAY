import java.util.Arrays;
public class removeElementAtIndex {
    public static void main(String[] args) {
        int[]arr={5,3,9,2,7,8,1};
        System.out.println(Arrays.toString(arr));
        int idx=3;
        for(int i=idx;i<arr.length-1;i++){
            arr[i]=arr[i+1];

        }

        System.out.println(Arrays.toString(arr));
    }
}

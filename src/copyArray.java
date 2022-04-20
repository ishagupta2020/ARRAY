import java.util.Arrays;
public class copyArray {
    public static void main(String[] args) {

        int[]arr={3,4,5,61,2,98};
        System.out.println(Arrays.toString(arr));
        int[]new_arr=new int[6];
        for(int i=0;i<arr.length;i++){
            new_arr[i]=arr[i];
        }

        System.out.println(Arrays.toString(new_arr));
    }
}

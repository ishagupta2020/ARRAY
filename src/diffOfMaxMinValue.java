import java.util.Arrays;
public class diffOfMaxMinValue {
    public static void main(String[] args) {
        int[] arr = {3, 9, 1, 0, 10, 15};
        System.out.println(Arrays.toString(arr));


        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("difference ->" + (max - min));
    }
}


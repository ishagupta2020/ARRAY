import java.util.Arrays;
public class sortNumericAndStringArray {
    public static void main(String[] args) {
        int[]arr1={234,876,564,459,123,986};
        String [] str={"PHP","Java","C"};
        System.out.print(Arrays.toString(arr1) + "");
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

       System.out.print(Arrays.toString(str) + "");
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));
}
}

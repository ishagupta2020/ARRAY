import java.util.*;
public class maxProduct {
    public static void maxPro(int[]arr){
        int maxProd=Integer.MIN_VALUE;
        int max_i=-1;
        int max_j=-1;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(maxProd<arr[i]*arr[j]){
                    maxProd=arr[i]*arr[j];
                    max_i=i;
                    max_j=j;
                }
            }
        }
        System.out.println("("+ arr[max_i]+"," +arr[max_j]+")"+ "=>"+(arr[max_i]*arr[max_j]));
    }

    public static void main(String[] args) {
        int[]arr={ 2, 3, 5, 7, -7, 5, 8, -5 };
        maxPro(arr);
    }
}

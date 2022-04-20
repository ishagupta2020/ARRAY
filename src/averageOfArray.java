public class averageOfArray {
    public static void main(String[] args) {
        int[]arr={4,5,8};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];

        }
        System.out.println(sum);
        float avg=sum/arr.length;
        System.out.println(avg);
    }
}

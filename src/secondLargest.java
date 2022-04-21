public class secondLargest {
    public static void main(String[] args) {
        int[]arr={56,34,23,99,99,68};
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }
            if(arr[i]<largest && arr[i]>secondLargest){
                secondLargest=arr[i];
            }
        }
        System.out.println(secondLargest);
    }
}

public class minEle {
    public int findMin(int[]arr){
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[]arr={4,7,13,8,1,9,0};
        minEle obj=new minEle();
        System.out.println( obj.findMin(arr));

    }
}

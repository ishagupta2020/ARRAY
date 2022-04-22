public class sumOfPairs {
    public void sumOfPairsOfNum(int[]arr,int num){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==num){
                    System.out.println((arr[i] +","+ arr[j])+"="+ num);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[]arr={3,2,6,1,8,9,5};
        sumOfPairs obj=new sumOfPairs();
        obj.sumOfPairsOfNum(arr,9);

}
}

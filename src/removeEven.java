public class removeEven {
    public int[]removeEvenInteger(int[]arr){
        int oddCount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                oddCount++;
            }
        }
        int[]result=new int[oddCount];
        int idx=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                result[idx]=arr[i];
                idx++;
            }
        }
        return result;
    }
    public void printArray(int[]arr){
        for(int element:arr){
            System.out.print(element +" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        removeEven obj=new removeEven();
        int[]arr={3,2,4,7,10,6,5};
      int[]result= obj.removeEvenInteger(arr);
        obj.printArray(result);
    }
}

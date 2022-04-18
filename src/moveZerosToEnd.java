public class moveZerosToEnd {
    public void moveZeros(int[]arr){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0 && arr[j]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            if(arr[j]!=0){
                j++;
            }
        }
    }
    public void printArray(int[]arr){
        for(int ele:arr){
            System.out.print(ele + " ");

        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[]arr={5,3,0,2,9,0,6,1,0,7};
        moveZerosToEnd obj=new moveZerosToEnd();
        obj.moveZeros(arr);
        obj.printArray(arr);
    }
}

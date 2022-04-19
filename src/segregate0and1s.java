public class segregate0and1s {
    void segregate(int[]arr){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            while(arr[left]%2==0){
                left++;
            }
            while(arr[right]%2==1){
                right--;
            }
            if(left<right){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
        }
    }
    public void printArray(int[]arr){
        for(int element:arr){
            System.out.print(element +" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[]arr={1,0,1,0,1,1,0,0};
        segregate0and1s obj=new segregate0and1s();
        obj.printArray(arr);
        obj.segregate(arr);
        obj.printArray(arr);
    }
}

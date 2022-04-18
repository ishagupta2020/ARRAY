public class reverseArray {
    public void reverse(int[]arr,int start ,  int end){

        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public void printArray(int[]arr){
        for(int element:arr){
            System.out.print(element +" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[]arr={6,2,8,0,1,7};
        reverseArray obj=new reverseArray();
        obj.printArray(arr);
        obj.reverse(arr, 0, arr.length-1);
        obj.printArray(arr);

    }
}


public class dutchNationalFlag {
    void segregate012s(int[]arr){
        int low=0;
        int mid=0;
        int high=arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,low,mid);
                low++;
                mid++;
            }
            if(arr[mid]==1){
                mid++;
            }
            if(arr[mid]==2){
                swap(arr,mid,high);
                high--;
            }
        }

    }
    void swap(int[]arr,int low,int mid){

        int temp=arr[low];
        arr[low]=arr[mid];
        arr[mid]=temp;
    }
    public void printArray(int[]arr){
        for(int element:arr){
            System.out.print(element +" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[]arr={0,2,1,0,1,0,2,0};
        dutchNationalFlag obj=new dutchNationalFlag();
        obj.printArray(arr);
        obj.segregate012s(arr);
        obj.printArray(arr);
    }
}


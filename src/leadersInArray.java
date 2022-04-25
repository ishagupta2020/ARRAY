public class leadersInArray {
     public void leaders(int[]arr,int n){
       n=arr.length;
       int max=arr[n-1];
         System.out.print(max+",");
       for(int i=n-2;i>=0;i--){
           if(max<arr[i]){
               max=arr[i];
               System.out.print(max + ",");
           }
       }
    }

    public static void main(String[] args) {
        leadersInArray obj=new leadersInArray();
        int[]arr={3,15,12,6,8,9,2};
        obj.leaders(arr,arr.length);
    }
}

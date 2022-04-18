public class findMissingNum {
    public int findMissing(int[]arr){
       int n=arr.length+1;
       int sum=n*(n+1)/2;
       for(int ele:arr){
           sum=sum-ele;
       }
       return sum;

    }

    public static void main(String[] args) {
        int[]arr={2,3,4,7,8,6,1};
        findMissingNum obj=new findMissingNum();
        System.out.println(obj.findMissing(arr));
    }
}

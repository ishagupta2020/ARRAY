public class findIndex {

    public int findInd(int[] arr, int item) {
        for (int i=0;i<arr.length;i++) {
            if (arr[i]==item) {
                return i;
            }

        }
        return 0;
    }

    public static void main(String[] args) {
        int[]arr={34,76,98,12,44,77,96};
      findIndex obj=new findIndex();
        System.out.println(obj.findInd(arr,77));
        System.out.println(obj.findInd(arr,11));
    }
}



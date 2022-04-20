public class containsValue {
    public boolean contains(int[] arr, int item) {
        for (int i=0;i<arr.length;i++) {
            if (arr[i] == item) {
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int[]arr={34,76,98,12,44,77,96};
        containsValue obj=new containsValue();
        System.out.println( obj.contains(arr,44));
        System.out.println( obj.contains(arr,55));

    }
}


import java.util.Arrays;
import java.util.ArrayList;
public class arrayToArraylist {
    public static void main(String[] args) {
        String[]arr={"PHP","java","C","Python"};
        ArrayList<String>list=new ArrayList<String>(Arrays.asList(arr));
        System.out.println(list);
    }
}

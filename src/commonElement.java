import java.util.Arrays;
import java.util.*;

public class commonElement {
    public static void main(String[] args) {
        String[]arr1={"PHP","JAVA","C","PYTHON"};
        String[]arr2={"PHP","C","PYTHON","PERL","HTML"};
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        HashSet<String>set=new HashSet<String>();
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    set.add(arr1[i]);
                }
            }
        }
        System.out.println(set);

    }
}

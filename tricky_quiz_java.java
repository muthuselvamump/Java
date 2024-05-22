import java.util.*;
public class tricky_quiz_java {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        Arrays.fill(arr,6);
        System.out.println(Arrays.toString(arr));
        int arr1[]={11,12,13,14,15};
        Arrays.fill(arr1,1,3,99);
        System.out.println(Arrays.toString(arr1));
    }
    
}

import java.util.Arrays;
public class arrayquiz {
 public static void main(String args[]){
    int arr[]={1,2,3,4,5,6};
    arrchange(arr);
    System.out.println(Arrays.toString(arr));
 }  
 public static void arrchange(int []a){
    a[0]=55;
 } 
}

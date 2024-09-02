import java.util.Arrays;
public class arrayquiz {
 public static void main(String args[]){
    int arr[]={1,2,3,4,5,6};
    arrchange(arr);
    System.out.println(Arrays.toString(arr));
    String s1="Java";
    stringchange(s1);
    System.out.println(s1);
    String str[]={"a","b","c"};
    strrchange(str);
    System.out.println(Arrays.toString(str));
 }  
 public static void arrchange(int []a){
    a[0]=55;
 } 
 public static void stringchange(String a){
   a="developer";
 }
 public static void strrchange(String[] args) {
   args[0]="z";
 }
}

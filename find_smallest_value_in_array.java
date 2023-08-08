import java.util.*;
public class find_smallest_value_in_array {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter array length");
        int arrl=scan.nextInt();
        scan.nextLine();
        int arr[]=new int[arrl];
        System.out.println("enter array value");
        for(int i=0;i<arrl;i++){
            arr[i]=scan.nextInt();
        }
        int k=arr[0];
        for(int j=1;j<arrl;j++){
            if(k>arr[j]){
                k=arr[j];
            }
        }
        System.out.println("smallest value in array is: " + k);
    }
    
}

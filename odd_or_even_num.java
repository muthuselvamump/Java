import java.util.*;
public class odd_or_even_num{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter a number");
        int num=1;
        num=scan.nextInt();
        if(num%2==0){
            System.out.println("its even number");
        }
        else{
            System.out.println("its odd number");
        }
        scan.close();
    }

}
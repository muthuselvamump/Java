import java.util.*;
public class odd_or_even_num_without_modulus {
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter a number");
        int j=scan.nextInt();
        int c=j&1;
        if(c==1){
            System.out.println("odd number");

        }
        else{
            System.out.println("even number");
        }
        scan.close();
    }
    
}

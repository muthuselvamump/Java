import java.math.BigInteger;
import java.util.*;
public class for_loop_factorial {
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=scan.nextInt();
        BigInteger n = BigInteger.valueOf(1);
        for(int i=1;i<=num;i++){
            n = n.multiply(BigInteger.valueOf(i));
        }
        System.out.println(num + " " + "factorial is: " + n);

    }
    
}

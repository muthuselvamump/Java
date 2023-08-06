import java.util.*;
public class for_loop_factorial {
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number"); //Using a double you'll get up to 170!
        double num=scan.nextLong();
        double k=1;
        for(double i=1;i<=num;i++){
            k =i*k;
        }
        System.out.println(num + " " + "factorial is: " + k);

    }
    
}

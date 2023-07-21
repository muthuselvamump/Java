import java.util.Scanner;

public class evenoddnumber{
    public static void main(String [] args){
        System.out.println("enter a number");
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        if(num%2==0){
            System.out.println(" Even number");
        }
        else{
            System.out.println(" odd number");
        }
        
    }
    
}

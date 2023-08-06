import java.util.*;
public class find_numbers_end_with_0_or_5_or_other_number {
    public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter a number");
    int num=scan.nextInt();
        if(num%5==0){
            if(num%10==0){
                System.out.println("ends with zero");
            }
            else{
                System.out.println("ends with five");
            }
        }
        else{
            System.out.println("ends with other number");
        }
    }
    
}

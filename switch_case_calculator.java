import java.util.*;
public class switch_case_calculator {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number :");
        int a=scan.nextInt();
        System.out.println("Enter a number :");
        int b=scan.nextInt();
        scan.nextLine();
        System.out.println("Enter a operator +,-,*,/,% :");
        char operator=scan.next().charAt(0);
        switch(operator){
            case '+':
                System.out.println("ans: " + (a+b));
                break;
            case '-':
                System.out.println("ans: "+ (a-b));
                break;
            case '*':
                System.out.print("ans: " + (a*b));
                break;
            case '/':
                System.out.println("ans: " + (a/b));
                break;
            case '%':
                System.out.println("ans:" + (a%b));
                break;
        }

    }
    
}

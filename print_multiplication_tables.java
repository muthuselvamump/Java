import java.util.*;
public class print_multiplication_tables{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=scan.nextInt();
        System.out.println(num + "th table");
        scan.nextLine();
        for(int i=1;i<=10;i++){
            System.out.println(i + "x" + num + "=" + "" + i*num);
        }
    }
}
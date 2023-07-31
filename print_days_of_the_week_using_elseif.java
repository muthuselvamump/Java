import java.util.*;
public class print_days_of_the_week_using_elseif {
    public static void main(String []args){
        System.out.println("enter day 1 to 7");
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        if(num == 1){
            System.out.println("Sunday");
        }
        else if(num==2){
            System.out.println("Monday");
        }
        else if(num==3){
            System.out.println("Tuesday");
        }
        else if(num==4){
            System.out.println("Wednesday");
        }
        else if(num==5){
            System.out.println("Thursday");
        }
        else if(num==6){
            System.out.println("Friday");
        }
        else if(num==7){
            System.out.println("Saturday");
        }
        else{
            System.out.println("enter a valid number 1 to 7");
        }
    }
    
}

import java.util.*;
public class ifelse {
    public static void main(String[] args){
       Scanner scan=new Scanner(System.in);
       System.out.println("Enter your mark");
       int mark=scan.nextInt();
       if(mark > 100 || mark < 0){
        System.out.println("please enter valid mark");
       }
       else{
       if(mark >= 90 && mark <= 100){
        System.out.println("a grade");
       }
       if(mark >= 70 && mark < 90){
        System.out.println("b grade");
       }
       if(mark >= 50 && mark < 70){
        System.out.println("c grade");
       }
       if(mark >= 0 && mark <= 49){
        System.out.println("faill study well");
       }
    }
    }
    
}

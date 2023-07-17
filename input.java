import java.util.*;
public class input {
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter name");
        String name=scan.nextLine();
        System.out.println("Hello, " + name);
        System.out.println("Enter your mobile no:");
        long mobilenum=scan.nextLong();
        System.out.println("Your Mobile No :" + mobilenum);
        System.out.println("you are 18 yrs old please enter true or false");
        boolean agelimit=scan.nextBoolean();
        System.out.println("okay");
        
    }
}

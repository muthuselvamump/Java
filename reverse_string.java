import java.util.*;
public class reverse_string{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter a String :");
        String str=scan.nextLine();
        //String str="java";
        String str1="";
        for(int i=str.length()-1;i>=0;i--){
            str1 +=str.charAt(i);
        }
        System.out.println(str1.toString());
    }
}
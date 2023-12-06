import java.util.*;
public class reverse_string{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter a array length: ");
        int n=scan.nextInt();
        scan.nextLine();
        String str2[]=new String[n];
        for(int i=0;i<n;i++){
            System.out.println("Please Enter a String: ");
            str2[i]=scan.nextLine();
        }
        
        /*String str=scan.nextLine();
        //String str="java";
        String str1="";
        for(int i=str.length()-1;i>=0;i--){
            str1 +=str.charAt(i);
        }
        System.out.println(str1);*/
       // System.out.println(str2.toString());
        for(String s:str2){
            System.out.println(s);
        }
    }
}
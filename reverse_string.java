import java.util.*;
public class reverse_string{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter a array length: ");
        int n=scan.nextInt();
        scan.nextLine();
        String str2[]=new String[n];
        String str3[]=new String[n];
        for(int i=0;i<n;i++){
            System.out.println("Please Enter a String: ");
            str2[i]=scan.nextLine();
        }
        for(int j=0;j<str2.length;j++){
            for(int i=str2[j].length()-1;i>=0;i--){
                str3[j] +=str2[j].charAt(i);
            }
            //System.out.println("hello" + str2[j]);
        }
        System.out.println(str3[0]);
        /*String str=scan.nextLine();
        //String str="java";
        String str1="";
        for(int i=str.length()-1;i>=0;i--){
            str1 +=str.charAt(i);
        }
        System.out.println(str1);
       // System.out.println(str2.toString());
        for(String s:str2){
            System.out.println(s);
        }*/
    }
}
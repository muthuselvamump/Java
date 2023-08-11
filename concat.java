public class concat {
    public static void main(String args[]){
        String s1="sachin";
        String s2="Tendulkar";
        s1=s1.concat(s2);
        String s6="java"+"OOPs";
        System.out.println(s1);
        s2=s1+100+100;
        System.out.println(s2);
        StringBuilder s3=new StringBuilder("hello");
        StringBuilder s4=new StringBuilder( "world");
        StringBuilder s5=s3.append(s4);
        System.out.println(s5);
        System.out.println(s5.toString());
        System.out.println(s6);
        

    }
    
}

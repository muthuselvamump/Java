public class concat {
    public static void main(String args[]){
        String s1="sachin";
        String s2="Tendulkar";
        s1=s1.concat(s2);
        System.out.println(s1);
        s2=s1+100+100;
        System.out.println(s2);
        StringBuilder s3=new StringBuilder("hello");
        StringBuilder s4=new StringBuilder( "world");
        StringBuilder s=s3.append(s4);
        System.out.println(s);
        System.out.println(s.toString());
        

    }
    
}

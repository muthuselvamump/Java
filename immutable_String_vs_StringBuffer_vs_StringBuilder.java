public class immutable_String_vs_StringBuffer_vs_StringBuilder {
    public static void main(String[] args){
        String s1="Hello";
        s1.concat("World");
        System.out.println(s1);
        StringBuffer s2=new StringBuffer("Hello");
        s2.append("World");
        System.out.println(s2);
        StringBuilder s3=new StringBuilder("Hello");
        s3.append("World");
        System.out.println(s2);


    }
    
}

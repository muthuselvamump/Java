public class String_methods {
    public static void main(String []args){
        String s="helloworld";
        s=s.replaceAll("[e,l,w]", "h");
        System.out.println(s);
        String s1="javadeveloper";
        System.out.println(s1.codePointAt(5));
        System.out.println(s1.contains("ava"));
        System.out.println(s1.endsWith("er"));
    }
    
}

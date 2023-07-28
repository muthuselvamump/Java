public class stringliterals {
    public static void main(String [] args){
        String test=new String("JAVA");
        String test1=new String("java");
        System.out.println(test.equals(test1));
        System.out.println(test.equalsIgnoreCase(test1));
        String s1="heloworld";
        String s2="HELLOWORLD";
        String s3="HeLlOwOrLd";
        System.out.println(s1.toUpperCase());
        System.out.println(s2.toLowerCase());
        System.out.println(s3.toLowerCase());
        System.out.println(s3.toUpperCase());
    }
    
}

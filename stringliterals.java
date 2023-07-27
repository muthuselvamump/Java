public class stringliterals {
    public static void main(String [] args){
        String test=new String("JAVA");
        String test1=new String("java");
        System.out.println(test.equals(test1));
        System.out.println(test.equalsIgnoreCase(test1));
    }
    
}

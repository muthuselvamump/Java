public class tricky_output2 {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        String s="hjk";
        int c=20;
        int d=20;
        System.out.println(a+b+s+c+d);
        test(null);
 
    }
    public static void test(Object obj){
        System.out.println("obj");
    }
    public static void test(String s){
        System.out.println("String");
    }
    
}

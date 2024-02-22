public class tricky_output2 {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        String s="hjk";
        int c=20;
        int d=20;
        System.out.println(a+b+s+c+d);
        test(null);
        System.out.println('A'+'B');//A AND B not a string its char so unicode of a and b will add 65+66=131
        System.out.println("A"+"B"+'A');//you try to conctenate primitive data after string date will be string
        System.out.println(20+1.34f+"a"+"b");
    }
    public static void test(Object obj){
        System.out.println("obj");
    }
    public static void test(String s){
        System.out.println("String");
    }
    
}

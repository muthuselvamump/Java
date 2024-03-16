public class tricky_output_java21 {
    public void print(Integer i) {
        System.out.println("Integer");
    }

    public void print(int i) {
        System.out.println("int");
    }

    public void print(long i) {
        System.out.println("long");
    }

    public static void main(String args[]) {
        tricky_output_java21 test = new tricky_output_java21();
        test.print(10);
    }
}

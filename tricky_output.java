public class tricky_output {
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
        tricky_output test = new tricky_output();
        test.print(10);
        test.print(Integer.valueOf(10));
    }
    
}

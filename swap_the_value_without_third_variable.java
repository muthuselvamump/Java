public class swap_the_value_without_third_variable {
    public static void main(String args[]){
        int a=15;
        int b=29;

        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a);
        System.out.println(b);
    }
    
}

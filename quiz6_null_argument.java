public class quiz6_null_argument{
    public static void main(String []args){
        foo(null);

    }  
    public static void foo(Object obj){
        System.out.println("Object argument");
    }
    public static void foo(String obj){
        System.out.println("String argument");
    }

}

public class tricky_output1 {
    public static void main(String []args){
        byte a=2;
        byte b=3;
       // byte c=a+b;//if we add two number it return integer type so if we didnt do type conversion its throw error
       //byte c=(byte)a+b;----->if we didnt add separate bracket its also throw error
       byte c=(byte)(a+b);
        System.out.println(c);
        int d=23;
        //int e=++23;////only we do increment variable we didnt do constand so its throw error
        int e=++d;
        System.out.println(e);
    }
    
}
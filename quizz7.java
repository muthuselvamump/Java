public class quizz7 {
    public static void quizz7(){
        System.out.println("java");
    }
    public static void main(String []args){
        quizz7();
        int x=10;
        System.out.println(x++ + ++x);
        int y=2;
        System.out.println(y++ + --y);
        System.out.println(x++ * y-- + ++x);
        Integer i=100;
        Integer i1=100;
        System.out.println(i==i1);
        Integer i2=128;
        Integer i3=128;
        System.out.println(i2==i3);//By default, these values will be from -128 to 127. So, for any number you pass between -128 and 127 (inclusive), it doesn't create the new Integer object. Instead it returns already cached object from the array. If you pass the number beyond this range, then only it creates a new Integer object
        
    }
    
}

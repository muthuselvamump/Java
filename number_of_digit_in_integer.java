public class number_of_digit_in_integer {
    public static void main(String []args){
        int number=15244;
        int length = String.valueOf(number).length();
        System.out.println(length);
        int length1=(int)Math.log10(number)+1;
        System.out.println(length1);
    }
    
}

public class quiz_java_new1 {
    public static void main(String []args){
        String x = new String("xyz");
        String y = "abc";
        x = x + y;
        /*Line 1 creates two, one referred to by x and the lost String "xyz". Line 2 creates one (for a total of three). Line 3 creates one more (for a total of four), the concatenated String referred to by x with a value of "xyzabc". */
    }
}

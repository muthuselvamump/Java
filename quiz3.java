public class quiz3{
    public static void main(String []args){
        int []arr={1,2,3,4,5};
        System.out.println(findvalue(arr));
        String s1="hello";
        s1.replace("{e,l,l}", "h");
        System.out.println(s1);




    }
    public static int findvalue(int []ar1){
        return ar1[ar1.length-ar1[2]];
    }
}
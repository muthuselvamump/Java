public class quiz3{
    public static void main(String []args){
        int []arr={1,2,3,4,5};
        System.out.println(findvalue(arr));

    }
    public static int findvalue(int []ar1){
        return ar1[ar1.length-ar1[2]];
    }
}
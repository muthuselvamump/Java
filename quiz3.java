public class quiz3{
    int k=0;
    public static void main(String []args){
        int []arr={1,2,3,4,5};
        System.out.println(findvalue(arr));
        String s1="hello";
        s1.replaceAll("[e,l,l]", "h");
        System.out.println(s1);
        s1=s1.replaceAll("[e,l,l]", "");
        System.out.println(s1);
        System.out.println('j' + 'a' + 'v' + 'a');//ASCII value of code 106 + 97 + 118 + 97 = 418
    }
    public static int findvalue(int []ar1){
        return ar1[ar1.length-ar1[2]];
    }
}
public class java_quiz1 {
    public static void main(String []args){
        int []arr=new int[0];
        //System.out.println(arr[0]);//array index out of bound
        int []arr1=new int[1];
        System.out.println(arr1[0]);
        String str=10+5+"hello";
        System.out.println(str);
        String str1= "DaiIly JaVa QuIz";
        String str2="DailyJavaQuiz";
        System.out.println(str1.trim().equalsIgnoreCase(str2));
        String str23="helloworld";
        System.out.println("substring:"+str23.substring(5));
        String concatnum="num";
        System.out.println(concatnum+10+10);
        System.out.println(10+10+concatnum);
    }
    
}

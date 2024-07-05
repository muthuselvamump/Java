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
        String s1="HELLO";
        s1.concat("WORLD");
        s1=s1+"coders";
        System.out.println(s1);
        int num1=4;
        int num2=++(num1);
        System.out.println(num2);
        String j1="JAVA";
        String j2=new String("JAVA");
    System.out.println(j1==j2);        
    int i=127;
    Integer i1=Integer.valueOf(127);
    System.out.println("integer quiz");
    System.out.println(i==i1);
    Integer i2=Integer.valueOf(12);
    Integer i3=Integer.valueOf(12);
    System.out.println("integer quiz");
    System.out.println(i2==i3);

    }
    
}

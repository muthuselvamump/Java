public class quizz25 {
    public static void main(String[] args) 
    { 
        int $_ = 5; 
        System.out.println($_);//special charator allowed for variable declarartion

        int x=10;
        if(x==10){
          //  int x=8;
            System.out.println(x);// dublicate local variable error
        }
        Integer a=Integer.valueOf(33);
        int b=a+x;
        System.out.println(b);
        Integer c=Integer.valueOf("44");
        b=a+c;
        int n=66;
        String s="33";
        String s1=n+s;
        System.out.println(s1);
        System.out.println(b);
    } 
    
}

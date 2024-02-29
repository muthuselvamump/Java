public class tricky_output_question {
    static int a=1;
    int b=2;
    public static void main(String []args){
        System.out.println(a);//static variable we can call without obj
        tricky_output_question t=new tricky_output_question();
        System.out.println(t.b);
    }
}

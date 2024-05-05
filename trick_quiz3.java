import java.util.*;
public class trick_quiz3 {
int []args1={8,9,5,4,};
    public static void main(String[] args) {
        System.out.println(args.length);
        int []args1={9,5,4,};
        System.out.println(args1.length);
        trick_quiz3 a=new trick_quiz3();
        System.out.println(a.args1.length);
        trick_quiz3 a1=new trick_quiz3();
        System.out.println("1st "+Arrays.toString(a.args1));
        System.out.println(Arrays.toString(a1.args1));
        a.args1[1]=55;
        System.out.println(Arrays.toString(a1.args1));
        System.out.println("1st "+Arrays.toString(a.args1));
    }
    
}

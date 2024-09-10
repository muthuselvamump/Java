import java.io.IOException;

class TEST{
    protected int x,y;
    int h;
    String str;
}
public class quiz_tricky_byte {
    public static void main(String[] args) throws IOException {
        byte b=126;
        for(;b>0;b++){
            System.out.println(b);
        }
        System.out.write("java".getBytes());

        System.out.println();
        String str1;
        TEST T=new TEST();
        System.out.println(T.x + " " +T.y);
        System.out.println(T.h);
        System.out.println(T.str);
        //System.out.println(str1);
    }
    
}

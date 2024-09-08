import java.io.IOException;

public class quiz_tricky_byte {
    public static void main(String[] args) throws IOException {
        byte b=126;
        for(;b>0;b++){
            System.out.println(b);
        }
        System.out.write("java".getBytes());
    }
    
}

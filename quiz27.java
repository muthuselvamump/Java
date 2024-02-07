import java.lang.*;
public class quiz27{
    public static void main(String []args){
        int i;
        try{
        for(i=0;i<1;i++){
            continue;
        }
        System.out.print(i);
         }
         finally{
            System.out.println("continue");
         }
         String d="12",ed="012";
         System.out.println(Integer.parseInt(d,9)+" "+Integer.parseInt(ed,16));
    }
}
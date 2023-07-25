public class breakfunction {
    public static void main(String [] args){
        loop:
        for(int i=0;i<=9;i++){
            inner_loop:
            for(int j=0;j<=9;j++){
            if(i==5){
                break inner_loop;
            }
            System.out.println(j);}
        }
    }
    
}

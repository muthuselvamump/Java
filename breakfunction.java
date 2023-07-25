public class breakfunction {
    public static void main(String [] args){
        loop:
        for(int i=0;i<=9;i++){
            for(int j=0;j<=9;j++){
            if(i==5){
                break loop;
            }
            System.out.println(j);}
        }
    }
    
}

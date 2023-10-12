public class odd_or_even_without_modulas {
    public static boolean iseven(int n){
        boolean iseven=true;
        for(int i=0;i<n;i++){
            iseven=!iseven;
        }
        return iseven;


    }
    public static void main(String []args){
        int n=50;
        if(iseven(n)){
            System.out.println("Even number");
        }
        else{
            System.out.printf("odd number");
        }

    }
    
}

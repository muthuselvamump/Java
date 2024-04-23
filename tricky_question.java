public class tricky_question {
    public static void main(String[] args) {
        int i=0;
        while(i<10){
            i++;
        }
        System.out.println(i);

        byte $date=(byte) 2205199;

        System.out.println($date);
        double d1=0.1;
        double d2=0.2;
        double d3=d1+d2;

        if(d3==0.3){
            System.out.println("3.5: " +d3);
        }
        else{
            System.out.println("long: "+d3);//because int+int=int, double+double=long, byte+byte=int, float+int=float, int+int=int
        }
    }
    
}

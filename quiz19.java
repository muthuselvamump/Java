public class quiz19 {
    public static void main(String []args){
        String x = new String("xyz");
        String y = "abc";
        x = x + y;//four string object created
        System.out.println(x);
        String x1= "abc";
        x1.toUpperCase(); 
        String y1 = x1.replace('A', 'a');
        y1 = y1 + "hjk";
        System.out.println(y1);
    }
    
}

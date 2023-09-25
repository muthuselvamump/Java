public class vowels_to_55_String {
    public static void main(String []args){
        String s="helloworld";
        StringBuilder str=new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                str.setCharAt(i,'5');
            }
        }
        s=str.toString();
        System.out.println(s);
    }    
}

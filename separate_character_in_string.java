public class separate_character_in_string {
    public static void main(String[] args ){
        String s="Helloworld";
        for(int i=0;i<s.length();i++){
            System.out.println(s.charAt(i));

        }
        String s1="java_object_oriented";
        char[] arr=s1.toCharArray();

        for(char a: arr){
            System.out.println(a);
        }

    }
    
}

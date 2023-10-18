public class count_how_many_character_in_a_string {
    public static void main(String []args){
        String s1="helloworld";
        System.out.println(s1.length());
        String s2=" hello java devloper ";
        int count=0;
        for(int i=0;i<s2.length();i++){
            if(s2.charAt(i) != ' '){
                count++;
            }
        }
        System.out.println("character count except space :- " + count);
    }  
}

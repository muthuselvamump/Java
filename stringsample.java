public class stringsample{
    public static void main(String [] args){
        char[] ch={'h','e','l','l','o'};
        String sh=new String(ch);
        System.out.println(sh);
        String new1="java";
        String new2="java";
        String new4=new String("welcome");
        String new3=new String("welcome");

        System.out.println(new1 == new2);
        System.out.println(new4 == new3);
     }
}
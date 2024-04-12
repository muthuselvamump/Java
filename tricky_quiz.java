public class tricky_quiz{
    public static void main(String []args){
        String s1="Java";
        String s2="java";
        boolean b=false;
        System.out.println(b);
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.compareToIgnoreCase(s2));     //s1 == s2 : The method returns 0.
                                                          //s1 > s2 : The method returns a positive value.
                                                        //s1 < s2 : The method returns a negative value.
    }
}
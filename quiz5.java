public class quiz5 {
    public static void main(String []args){
        String s1 = "Java";  
String s2 = "Java";  
StringBuilder sb1 = new StringBuilder();  
sb1.append("Ja").append("va");  
System.out.println(s1 == s2);  
System.out.println(s1.equals(s2));  
System.out.println(sb1.toString() == s1);  
System.out.println(sb1.toString().equals(s1));
int five=5;
int two=2;
int total =five+(five >6? ++two : --two);
System.out.println(total);
    }
    
}

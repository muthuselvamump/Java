public class find_the_number_of_digit {
    public static void main(String args[]){
    int num=12345;
   // int count;//int this case we didn intialized but we intialized into the loop that the reason its throw error local variable doesnt intialized
    int count=0;
    while(num>0){
        num=num/10;
        count +=1;
    }
    System.out.println(count);
}
}

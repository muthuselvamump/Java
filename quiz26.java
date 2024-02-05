public class quiz26 {
    int i;
    int j;
    quiz26(int i,int j){
        this.i=i;
        this.j=j;
    }
    public static void main(String args[]){
        quiz26 q=new quiz26(26, 24);
        quiz26 q1=q;
        q1.i=222;
        q1.j=333;
        System.out.println(q.i+ " "+q.j);

    }
    
}

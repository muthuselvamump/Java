import java.util.* ;
public class bublesort{
    public static void main(String[] args){
        Scanner arrinp=new Scanner(System.in);
        System.out.println("enter a array length");
        int len=arrinp.nextInt();
        int arr[]=new int[len];
        System.out.println("enter a array value");
        for(int l=0;l<arr.length;l++){
            arr[l]=arrinp.nextInt();
        }
        boolean flag=false;
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    flag=true;
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            if(flag==false){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

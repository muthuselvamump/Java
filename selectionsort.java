import java.util.* ;
public class insertionsort{
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        System.out.println("enter a array length");
        int len=a.nextInt();
        int arr[]=new int[len];
        System.out.println("enter a array value");
        for(int l=0;l<arr.length;l++){
            arr[l]=a.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    int k=arr[i];
                    arr[i]=arr[j];
                    arr[j]=k;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }

}

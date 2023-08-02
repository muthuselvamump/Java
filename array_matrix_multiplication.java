import java.util.Arrays;
public class array_matrix_multiplication {
    public static void main(String []args){
        int arr1[][]={{2,3,5},
                      {3,4,2},
                      {2,4,5}};
        int arr2[][]={{4,4,5},
                      {5,6,4},
                      {4,1,3}};
        
        int[][] arr3=new int[3][3];
         for(int i=0;i<arr1.length;i++){
            for (int j=0;j<arr1.length;j++){
                for(int k=0;k<arr1.length;k++){
                    arr3[i][j]=arr3[i][j]+arr1[i][k]*arr2[k][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(arr3));
    }
}

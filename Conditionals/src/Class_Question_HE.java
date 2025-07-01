import java.util.Arrays;

public class Class_Question_HE {

    public static void main(String[] args) {
        int[] arr = { 4 ,8, 5, 1, 3 , 7, 9 ,2 , 0};

        int[][] arr2d = new int[2][7];
        int k=0;
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length ; j++) {
                if(arr[i] + arr[j] == 8){
                    arr2d[k][0]=arr[i];
                    arr2d[k][1]=arr[j];
                    k++;
                }
            }

            for(int d=0;d<arr2d.length;d++){
                System.out.println(arr2d[d][0] + "," + arr2d[d][1]);
            }
        }
    }
}

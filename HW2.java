import java.util.Arrays;

class HW2 {
    public static void main(String[] args) {


        int[] arr = {1, 0, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 0, 0, 1}; //1
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[i] = 0;
            } else arr[i] = 1;
        }
        System.out.println(Arrays.toString(arr));

        int[] arr1 = new int[8]; //2
        for (int a = 1; a < arr1.length; ++a) {
            arr1[a] = arr1[a - 1] + 3;
        }
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};  //3
        for (int b = 0; b < arr2.length; b++) {
            if (arr2[b] < 6) {
                arr2[b] = arr2[b] * 2;
            }
        }
        System.out.println(Arrays.toString(arr2));


        int[][] arr3 = new int[5][5];  //4
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3.length; j++) {
                if (i == j) arr3[i][j] = 1;

                System.out.print(arr3[i][j] + "  ");
            }
        }
        System.out.println(Arrays.toString(arr3));
    }
}
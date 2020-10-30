import java.util.Arrays;

public class JavaOneTaskOne {
    public static void main(String[] args) {

        // task1
        int[] firstArr = {0, 1, 1, 1, 0, 0, 1, 1, 1, 0};
        for(int i = 0; i < firstArr.length; i++){
            if(firstArr[i] == 0){
                firstArr[i] = 1;
            }else{
                firstArr[i] = 0;
            }
            System.out.print(firstArr[i] + " ");
        }

        System.out.println('\n' + "- - - - - - - - - -");

        // task2
        int[] secondArr = new int[8];
        for(int i = 0; i < secondArr.length; i++){
            secondArr[i] = i*3;
            System.out.print(secondArr[i] + " ");
        }

        System.out.println('\n' + "- - - - - - - - - -");

        // task3
        int[] thirdArr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int i = 0; i < thirdArr.length; i++){
            if(thirdArr[i] < 6){
                thirdArr[i] = thirdArr[i] * 2;
            }
            System.out.print(thirdArr[i] + " ");
        }

        System.out.println('\n' + "- - - - - - - - - -");

        //task4
        int[][] fourthArr = new int[4][4];
        for(int i = 0; i < fourthArr.length; i++){
            for(int j = 0; j < fourthArr.length; j++){
                if(i == j || i+j == 3){
                    fourthArr[i][j] = 1;
                }
                System.out.print(fourthArr[i][j]  + " ");
            }
            System.out.println();
        }
        System.out.println("- - - - - - - - - -");

        // task5
        int[] arrForMinAndMax = thirdArr;
        int max = arrForMinAndMax[0];
        int min = 100;
        for(int i = 0; i < arrForMinAndMax.length; i++){
            if(arrForMinAndMax[i] > max){
                max = arrForMinAndMax[i];
            }
            else if(arrForMinAndMax[i] < min){
                min = arrForMinAndMax[i];
            }
        }
        System.out.println("Максимум массива: " + max + ", а минимум: " + min);

        System.out.println("- - - - - - - - - -");

        int[] a = {2, 2, 2, 1, 2, 2, 10, 1};
        int[] b = {2, 2, 2, 1, 2, 2, 10, 2};
        System.out.println(checkArrayBalance(a));
        System.out.println(checkArrayBalance(b));

        System.out.println("- - - - - - - - - -");
        int[] testArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        arrayShift(testArray, 3);
    }

    //task6
    public static boolean checkArrayBalance(int[] a){
        for(int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = 0; j < i; j++) {
                sum += a[j];
            }
            for (int j = i; j < a.length; j++) {
                sum -= a[j];
            }
            if (sum == 0) {
                return true;
            }
        }
        return false;
    }

    //task7
    public static void arrayShift(int[] arr, int n){
        if(n < 0){
            for(int i = 0; i < n; i++) {
                int tmp = arr[0];
                for (int j = 0; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = tmp;
            }
        }else{
            for(int i = 0; i < n; i++) {
                int tmp = arr[0];
                arr[0] = arr[arr.length - 1];
                for (int j = 1; j < arr.length - 1; j++) {
                    arr[arr.length - j] = arr[arr.length - j - 1];
                }
                arr[1] = tmp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}

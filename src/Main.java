
public class Main {
    public static void main(String[] args) {
        //Задача 1.1
        int[] firstArray = new int[]{1, 2, 3};
       // Задача 1.2
        double[] secondArray = {1.57, 7.654, 9.986};
        // Задача 1.3
        int[] thirdArray = {1, 23, 45, 67, 89};

        // Задача 2
        int r = 0;
        while (r < firstArray.length) {
            System.out.print(firstArray[r]);
            if (r != secondArray.length - 1) {
                System.out.print(", ");
            }
            r++;
        }

        System.out.println();

        for (int m = 0; m < secondArray.length; m++){
            System.out.print(secondArray[m]);
            if (m != secondArray.length - 1){
                System.out.print(", ");
            }

        }

        System.out.println();

        for (int i = 0; i < thirdArray.length; i++){
            System.out.print(thirdArray[i]);
            if (i != thirdArray.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println();

        // Задача 3
        for (int e = firstArray.length - 1; e >= 0; e--) {
            if (e != firstArray.length - 1) {
                System.out.print(", ");
            }
            System.out.print(firstArray[e]);
        }

        System.out.println();

        for (int t = secondArray.length - 1; t >= 0; t--) {
            if (t != secondArray.length - 1) {
                System.out.print(", ");
            }
            System.out.print(secondArray[t]);
        }
        System.out.println();

        for (int u = thirdArray.length - 1; u >= 0; u--) {
            if (u != thirdArray.length - 1) {
                System.out.print(", ");
            }
            System.out.print(thirdArray[u]);
        }
        System.out.println();

// Задача 4
        for (int q = 0; q < firstArray.length; q++){

            if (firstArray[q] % 2 != 0){
                firstArray[q] += 1;
            }
            System.out.print(firstArray[q]);
            if (q != firstArray.length - 1) {
                System.out.print(", ");
            }

        }
    }
}
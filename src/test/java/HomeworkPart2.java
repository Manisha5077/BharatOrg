public class HomeworkPart2 {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        double[] array2 = {2.5, 3.0, 4.7, 1.2};
        String[] array3 = {"apple", "banana", "orange", "pear"};

        // Pass arrays to method
        modifyArrays(array1, array2, array3);

        // Print modified arrays
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }
        System.out.println();
    }

    public static void modifyArrays(int[] arr1, double[] arr2, String[] arr3) {
        // Modify arrays
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] *= 2;
        }

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] += 1.0;
        }

        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = arr3[i].toUpperCase();
        }

        // Return modified arrays
      //  return;
    }

}

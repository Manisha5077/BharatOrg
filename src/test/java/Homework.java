import java.util.Arrays;

public class Homework {

    public static void main(String[] args){
int [] sampleArray= createArrayAndReturn();
        Homework homework= new Homework();
        //homework.arrayAsParameter(homework.createArrayAndReturn());
        //homework.arrayAsParameter(sampleArray);
        System.out.println(isArraySorted(sampleArray));
    }

    //return Array in one method than use that array in parameter of second method than print array in third method
    //Array in parameter
    //sorted or not
    //multiArray- value int bhi pass krni h
    //Array 1,2, 3, multiarray
    //sending value of special index

    public static int[] createArrayAndReturn(){
        int[] sampleArray1= {98,76,54,32,22};
        return sampleArray1;
    }

    public void arrayAsParameter(int[] sampleArray){
        for (int element : sampleArray) {
            System.out.println(element);
        }
    }

    public static boolean isArraySorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i-1]) {
                return false;
            }
        }
        return true;
    }

    public static void multiDimensionalArrayWithInteger() {
        int[][] multiArray = new int[3][3];
        multiArray[0][0] = 1;
        multiArray[0][1] = 2;
        multiArray[0][2] = 3;
        multiArray[1][0] = 4;
        multiArray[1][1] = 5;
        multiArray[1][2] = 6;
        multiArray[2][0] = 7;
        multiArray[2][1] = 8;
        multiArray[2][2] = 9;
        System.out.println(multiArray[1][2]); // Prints 6
    }

    public static void multiDimensionalArrayWithString() {
        String[][] multiArray = {
                {"apple", "orange", "banana"},
                {"car", "bus", "train"},
                {"red", "blue", "green"}
        };
        System.out.println(multiArray[1][2]); // Prints "train"
    }
    public static void multiDimensionalArrayWithStringIndexWise() {
        String[][] multiArray = new String[3][3];
        multiArray[0][0] = "apple";
        multiArray[0][1] = "orange";
        multiArray[0][2] = "banana";
        multiArray[1][0] = "car";
        multiArray[1][1] = "bus";
        multiArray[1][2] = "train";
        multiArray[2][0] = "red";
        multiArray[2][1] = "blue";
        multiArray[2][2] = "green";

        // Print the elements of the array using a nested for loop
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.print(multiArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void specificIndex() {
        int[] myArray = {1, 2, 3, 4, 5};
        int value = myArray[3]; // Get the value at index 3
        myMethod(value); // Send the value to the method

    }

    public void myMethod(int value){

        System.out.println(value);
    }

    public static int[] addArrays(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] + arr2[i];
        }
        return result;
    }



}

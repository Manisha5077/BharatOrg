import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Manisha_session9 {

    public static void main(String[] args){

        Manisha_session9 manishaSession9 = new Manisha_session9();

        //manishaSession9.whileDoWhileLoopImplementation();
        //manishaSession9.integerTypeArray();
        //manishaSession9.intTypeArrayDynamicValueAtRuntime();
        //manishaSession9.newMethodForArray3();
        manishaSession9.integerValueArrayInitializationUsingForLoop();
        //manishaSession9.doWhileLoop();
       // manishaSession9.breakContinueStatement();
    }

    public void whileDoWhileLoopImplementation(){

        int i=1;
        while(i<=10){
  /*if(i<2 || i==3){

      System.out.println(i);
  }*/

            if(i%2==0){
                i++;
                continue;} //continue do skip

                 else if(i%7==0) {
                   //  System.out.println(i);
                     break;
                 }
                 else {
            }
            System.out.println(i);
            i++;
        }
    }

    public void breakContinueStatement() {

        for (int i = 0; i < 10; i++) {




            if (i% 3==0) {
                continue;
            }

            if (i% 5==0) {
                break;

            }
            System.out.println(i);
        }

    }

   public void doWhileLoop(){

        int i=1;
        do{
            //print 1 to 10
            System.out.println(i);
            i++;

        }while(i<=10);


   }
    public void doWhileLoopWithContinueAndBreak(){

        int i=1;
        do {
            if(i%3==0){
                System.out.println(i);
                continue;
            }

            if(i%5==0){
                break;
            }
            i++;
        }while(i<=10);


        }


        public void integerTypeArray(){

        int[] integerTypeArray = {5,6,6,34,99};

             //integerTypeArray [0]=5
            //integerTypeArray [1]=6
            //integerTypeArray [2]=6
            //integerTypeArray [3]=34
            //integerTypeArray [4]=99

        //Size=upperbound-lowerbound+1 [4-0+1]
            System.out.println("Size of Integer Type Array: "+    integerTypeArray.length);
            System.out.println("Size of Integer Type Array: "+    (integerTypeArray.length-1));
            System.out.println("Size of Integer Type Array: "+    (integerTypeArray.length-2));
            System.out.println("Size of Integer Type Array: "+    (integerTypeArray.length-3));
            System.out.println("Size of Integer Type Array: "+    (integerTypeArray.length-4));
            System.out.println("Size of Integer Type Array: "+    (integerTypeArray.length-5));
            System.out.println("Size of Integer Type Array: "+    (integerTypeArray.length-6));

            System.out.println("========================================================================================");

            System.out.println("Value of Integer type Array at index 4:   "+ integerTypeArray[integerTypeArray.length-1]);
            System.out.println("Value of Integer type Array at index 3:   "+ integerTypeArray[integerTypeArray.length-2]);
            System.out.println("Value of Integer type Array at index 2:   "+ integerTypeArray[integerTypeArray.length-3]);
            System.out.println("Value of Integer type Array at index 1:   "+ integerTypeArray[integerTypeArray.length-4]);
            System.out.println("Value of Integer type Array at index 0:   "+ integerTypeArray[integerTypeArray.length-5]);
           try{

               System.out.println("Value of Integer type Array at index 4:   "+ integerTypeArray[6]);
           }
           catch(Exception arrayIndexOutOfBoundsException){

               System.out.println("Please check your code for index" );

            }





        }

        public void intTypeArrayDynamicValueAtRuntime(){

            int[] integerTypeArray = {5,6,6,34,99};

            for(int i=0;i<integerTypeArray.length;i++){

                System.out.println("Value of Array is : "+integerTypeArray[i]);

            }

            int[] integerTypeArray2;

            integerTypeArray2= new int[2];

            integerTypeArray2[0]= 5;
            integerTypeArray2[1]=15;

            for(int i=0;i<integerTypeArray2.length;i++){

                System.out.println("integerTypeArray2:   "+ integerTypeArray2[i]);
            }



        }


        public void newMethodForArray3(){

            int[] integerTypeArray3;

            integerTypeArray3= new int[5];
            try{

                System.out.println("Please enter the value of integer type Array 3 :  ");
                Scanner scanner = new Scanner(System.in);
                System.out.println("Please enter the value of index 0 :  ");
                integerTypeArray3[0]= scanner.nextInt();
                System.out.println("Please enter the value of index 1 :  ");
                integerTypeArray3[1]=scanner.nextInt();
                System.out.println("Please enter the value of index 2 :  ");
                integerTypeArray3[2]= scanner.nextInt();
                System.out.println("Please enter the value of index 3 :  ");
                integerTypeArray3[3]= scanner.nextInt();
                System.out.println("Please enter the value of index 4 :  ");
                integerTypeArray3[4]= scanner.nextInt();


            }
            catch(InputMismatchException inputMismatchException){

                System.out.println("please enter valid input");
              //  intTypeArrayDynamicValueAtRuntime();
            }

            for(int i=0;i<integerTypeArray3.length;i++){

                System.out.println("integerTypeArray3:   "+ integerTypeArray3[i]);
            }


        }


        public void integerValueArrayInitializationUsingForLoop(){

        int[] integerValueArrayInitializationUsingForLoop ;
            integerValueArrayInitializationUsingForLoop = new int[5];
            Scanner scanner = new Scanner(System.in);

            for(int i=0;i<integerValueArrayInitializationUsingForLoop.length;i++){

                System.out.println("Enter integerValueArrayInitializationUsingForLoop["+i+"]   ");
                integerValueArrayInitializationUsingForLoop[i]= scanner.nextInt();

        }
            for(int i=0;i<integerValueArrayInitializationUsingForLoop.length;i++) {

                System.out.println(integerValueArrayInitializationUsingForLoop[i]);

            }

            /*for(int i=0; i<integerValueArrayInitializationUsingForLoop.length;i++){

                for(int j=i+1; j<integerValueArrayInitializationUsingForLoop.length;j++){

                  if(integerValueArrayInitializationUsingForLoop[i]>integerValueArrayInitializationUsingForLoop[j]){



                  }*/

            /*int largest = integerValueArrayInitializationUsingForLoop[0];
            //int integerValueArrayInitializationUsingForLoop[0] = largest;
            for(int i=1; i<integerValueArrayInitializationUsingForLoop.length;i++){

               if( integerValueArrayInitializationUsingForLoop[i]> largest) {
                   largest= integerValueArrayInitializationUsingForLoop[i];
               }

                }
            System.out.println("largest:  "+largest);
*/


            int lowest = integerValueArrayInitializationUsingForLoop[0];
            //int integerValueArrayInitializationUsingForLoop[0] = largest;
            for(int i=1; i<integerValueArrayInitializationUsingForLoop.length;i++){

                if( integerValueArrayInitializationUsingForLoop[i]< lowest) {
                    lowest= integerValueArrayInitializationUsingForLoop[i];
                }

            }
            System.out.println("lowest:  "+lowest);
        }




            }











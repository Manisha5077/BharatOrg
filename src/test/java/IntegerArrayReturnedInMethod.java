import java.util.Scanner;

public class IntegerArrayReturnedInMethod {

public static void main(String[] args ){

   //arrayMethod();
  //IntegerArrayReturnedInMethod integerArrayReturnedInMethod= new IntegerArrayReturnedInMethod();
   //integerArrayReturnedInMethod.arrayReturnType();
    characterTypeArray();
}
    public static int[] arrayMethod() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the size of an Array: ");
            int arrayLength= scanner.nextInt();

             int[] integerArray= new int[arrayLength];
        System.out.println("Please enter the elements of an Array: ");

        for(int i=0;i<arrayLength;i++){
            System.out.println("Enter: ");
            integerArray[i]=  scanner.nextInt();


        }
        for(int i: integerArray ){
            System.out.println(i);
        }
             return integerArray;
    }

public void arrayReturnType(){

 int integerArray2[]=  arrayMethod();
    for(int i: integerArray2 ){
        System.out.println("Output of ArrayReturnType method : "+i);
    }

    for(int i=0;i<integerArray2.length;i++ ){
        int smallValue=integerArray2[0];
        if(integerArray2[i]>integerArray2[0]){
            smallValue=integerArray2[i];
        }
        System.out.println("Smallest : "+integerArray2[i]);
    }
}


public void arrayPassedInParameterMethod(int[] arrayPara){



}

public static void characterTypeArray(){
int i;
    char[] ch= {'m','a','n','i','s','h','a'};
    for(i=0;i<ch.length;i++){
        System.out.println(ch[i]);

    }

}


}


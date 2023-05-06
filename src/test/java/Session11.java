public class Session11 {

    public static void main(String[] args) {
        Session11 session11 = new Session11();
        // session11.multiDimensionalArrays();
        session11.stringDeclaration();
        //session11.takingMiddleNameWithoutMethod();
    }

    public void multiDimensionalArrays() {


        int[] simpleArray = {22, 33, 55, 65, 87};
        //int[][] multiArray= int[3][3];
        int[][] multiArray2 = {{22, 33, 44}, {55, 22, 33}, {22, 21, 32}};
        int[][] multiArray3 = {{11, 10, 20}, {10, 20, 22}, {22, 21, 12}};

        for (int i = 0; i < multiArray2.length; i++) {
            for (int j = 0; j < multiArray2.length; j++) {

                System.out.print(" " + multiArray2[i][j]);

            }
            System.out.println(" ");

        }
        // int newArray[][]= multiArray2.length;

    }

    public void stringDeclaration() {

        String str = "Manisha Chaudhary";//1//string literal
        System.out.println(str);

        String str1 = new String("Gaurav");//here we are creating a memory first//string with new object

        System.out.println("str1: " + str1);
        String str3 = str;//2
        System.out.println("str3: " + str3);
        String str4 = "Manisha Chaudhary";//3

        String str5 = "MANISHA CHAUDHARY";

        //String Initialzation using character Array
        char[] characterArray = {'b', 'h', 'a', 'r', 'a', 't'};
        String str6 = new String(characterArray);
        String str7 = "Welcome@To@delhi";
        //String str7example = "Welcome@To@Delhi@Noida@Bulandshahr";
        String str7example = "200$00$00";

        String str8="   Jo bhi apko sahi lage    ";
       //Compare value of String objects using equals method
        boolean flag = false;
        flag = str.equals(str1);
        System.out.println("compare " + flag);

        flag = str.equals(str3);
        System.out.println("compare " + flag);

        flag = str.equals(str4);
        System.out.println("compare " + flag);

        flag = str.equals(str5);
        System.out.println("compare " + flag);

        flag = str.equalsIgnoreCase(str5);
        System.out.println("compare " + flag);

        //Compare reference of String objects with == operator
        flag = (str == str1);
        System.out.println("==:  " + flag);
        flag = (str == str3);
        System.out.println("==:  " + flag);
        flag = (str == str4);
        System.out.println("==:  " + flag);

        //== reference address ; equals krta h value ko check

        //Compare method used to check the alphabet number in a string
        System.out.println("str.compareTo(str1):  " + "B".compareTo("A"));
        System.out.println("abc" + "xyz");
        System.out.println("abc".concat("efg"));
        System.out.println(str.concat(str1));
        System.out.println("/////////////////////////////////////////////////////////////////////");
        System.out.println("str.substring(2):  " + str.substring(2));
        System.out.println("/////////////////////////////////////////////////////////////////////");
        System.out.println("str.substring(0,3):  " + str.substring(0, 3));
        System.out.println("str6: " + str6);

         str7example.replaceAll("$","#");
String[] stringArray= str7example.split("[$]");

for(String s: stringArray) {
    System.out.println("str7example.split(\"$\"):   " + s);

}
//$ Unable to split $ sign
       /* for(int i=0;i<str7example.length();i++){

            if(str7example.charAt(i)=='$'){
                str7example.charAt[i]='#';
                String newName= str7example.substring(i+1,str7example.length());
                System.out.println("");
                for(int j=0;j<newName.length();j++) {
                    System.out.print(newName.charAt(j));
                    if (newName.charAt(j) == ' ') {
                        break;
                    }*/
                }}
/*        System.out.println("str8.trim: "+ str8.trim().replace(" ","tt"));
        System.out.println("str8.trim: "+ str8.trim().replaceAll("\\s",""));

        String checkMiddleName = "Mahender singh dhoni";

        System.out.println( checkMiddleName.substring(checkMiddleName.indexOf(" ")+1,checkMiddleName.lastIndexOf(" ")));

        }

        public void takingMiddleNameWithoutMethod(){

            String name = "Mahender singh dhoni";
            for(int i=0;i<name.length();i++){
            if(name.charAt(i)==' '){
                String newName= name.substring(i+1,name.length());
                System.out.println("");
                for(int j=0;j<newName.length();j++){
                    System.out.print(newName.charAt(j));
                    if(newName.charAt(j)==' '){
                        break;
                    }
                }break;
            }}*/





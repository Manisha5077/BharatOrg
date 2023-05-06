public class Situation {


    public static void main(String[] args){
        currentSituation();

    }

    public static void currentSituation(){

        String s1="feeling sad";
        if(s1== "feeling sad"){
            System.out.println("can't Study because I am feeling sad");


            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("OK!!!! Checking Situation again ");

            try {
                Thread.sleep(4000);
                System.out.println("oh .... MANISHA poor BABY....  Still sad :( ");
                currentSituation();

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }



}

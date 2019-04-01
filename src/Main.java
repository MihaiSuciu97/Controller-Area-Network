

public class Main {

    public static void main(String[] args) {


        ECM ecm = new ECM();
        ecm.execute();
        if(ecm.isImportant()==true){
            ecm.repair();
        }
        else{
            System.out.println("Is not important");
        }



        }

}

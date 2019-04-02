import entities.ECM;
import entities.Roof;

public class Main {

    public static void main(String[] args) {

        Roof roof = new Roof();
        roof.execute();

        ECM ecm = new ECM();
        ecm.execute();
        if(roof.isImportant()==true){
            roof.open();
        }
        else{
            if(ecm.isImportant()==true){
                ecm.repair();
                roof.open();
            }
        }
    }

}

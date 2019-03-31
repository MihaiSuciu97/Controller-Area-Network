import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

//Engine Control Module
public class ECM {
    private int ECM_id;
    private boolean isImportant;
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");


    void execute() {
        Date date = new Date();
        System.out.println("An problem with ECM at "+dateFormat.format(date));
    }

    void repair() {
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Date date = new Date();
        System.out.println("Repaired at " + dateFormat.format(date));
    }
}

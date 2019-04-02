package entities;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

//transmission Control Unit
public class TCU {
    private int TCU_id;
    private boolean isImportant = true;
    private DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    void execute() {
        Date date1 = new Date();
        System.out.println("TCU intercepted " + dateFormat.format(date1));
    }

    void repair() {
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Date date2 = new Date();
        System.out.println("TCU used " + dateFormat.format(date2));
    }

    public boolean isImportant() {
        return isImportant;
    }

    public void setImportant(boolean important) {
        isImportant = important;
    }

    public int getTCU_id() {
        return TCU_id;
    }

    public void setTCU_id(int TCU_id) {
        this.TCU_id = TCU_id;
    }
}
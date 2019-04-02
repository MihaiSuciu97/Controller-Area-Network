package entities;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Roof {
    private int Roof_id;
    private boolean isImportant = false;
    private DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public void execute() {
        Date date1 = new Date();
        System.out.println("Roof open required " + dateFormat.format(date1));
    }

    public void open() {
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Date date2 = new Date();
        System.out.println("Roof opened at " + dateFormat.format(date2));
    }

    public int getRoof_id() {
        return Roof_id;
    }

    public void setRoof_id(int roof_id) {
        Roof_id = roof_id;
    }

    public boolean isImportant() {
        return isImportant;
    }

    public void setImportant(boolean important) {
        isImportant = important;
    }
}

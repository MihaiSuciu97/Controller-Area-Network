package entities;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class ABS {
    private int ABS_id;
    private boolean isImportant = true;
    private DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    void execute() {
        Date date1 = new Date();
        System.out.println("You need to use ABS NOW " + dateFormat.format(date1));
    }

    void repair() {
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Date date2 = new Date();
        System.out.println("ABS used " + dateFormat.format(date2));
    }

    public int getABS_id() {
        return ABS_id;
    }

    public void setABS_id(int ABS_id) {
        this.ABS_id = ABS_id;
    }

    public boolean isImportant() {
        return isImportant;
    }

    public void setImportant(boolean important) {
        isImportant = important;
    }



}

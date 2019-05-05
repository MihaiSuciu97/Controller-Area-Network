package entities;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

//Engine Control Module
public class ECM {
    private int ECM_id;
    private boolean isImportant = true;
    private DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");


    public Date execute() {
        Date date1 = new Date();
        return date1;

    }

    public Date repair() {
       /* try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        Date date2 = new Date();
        return date2;
    }

    public int getECM_id() {
        return ECM_id;
    }

    public void setECM_id(int ECM_id) {
        this.ECM_id = ECM_id;
    }

    public boolean isImportant() {
        return isImportant;
    }

    public void setImportant(boolean important) {
        isImportant = important;
    }
}

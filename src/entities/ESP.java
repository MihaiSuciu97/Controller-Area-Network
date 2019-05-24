package entities;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

//Engine Control Module
public class ESP {
    private int ESPId;
    private boolean isImportant = true;
    private DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");


    public Date execute() {
        Date date1 = new Date();
        return date1;
    }

    public Date repair() {

        Date date2 = new Date();
        return date2;
    }



    public boolean isImportant() {
        return isImportant;
    }

    public void setImportant(boolean important) {
        isImportant = important;
    }

    public int getESPId() {
        return ESPId;
    }

    public void setESPId(int ESPId) {
        this.ESPId = ESPId;
    }
}

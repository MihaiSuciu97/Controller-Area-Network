package entities;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Oil {
    private int oilId;
    private boolean isImportant=false;
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

    public int getOilId() {
        return oilId;
    }

    public void setOilId(int oilId) {
        this.oilId = oilId;
    }
}

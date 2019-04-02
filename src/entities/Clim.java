package entities;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Clim {
    private int Clim_id;
    private boolean isImportant=false;
    private DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public void execute() {
        Date date1 = new Date();
        System.out.println("Open clim required" + dateFormat.format(date1));
    }

    public void open() {
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Date date2 = new Date();
        System.out.println("Climatization turned on" + dateFormat.format(date2));
    }
    public int getClim_id() {
        return Clim_id;
    }

    public void setClim_id(int clim_id) {
        Clim_id = clim_id;
    }

    public boolean isImportant() {
        return isImportant;
    }

    public void setImportant(boolean important) {
        isImportant = important;
    }
}

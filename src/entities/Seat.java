package entities;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Seat{
    private int Seat_id;
    private boolean isImportant = false;
    private DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public void execute() {
        Date date1 = new Date();
        System.out.println("Change seat position " + dateFormat.format(date1));
    }

    public void open() {
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Date date2 = new Date();
        System.out.println("Seat position changed" + dateFormat.format(date2));
    }

    public boolean isImportant() {
        return isImportant;
    }

    public void setImportant(boolean important) {
        isImportant = important;
    }

    public int getSeat_id() {
        return Seat_id;
    }

    public void setSeat_id(int seat_id) {
        Seat_id = seat_id;
    }
}

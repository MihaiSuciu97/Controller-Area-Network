package entities;

import java.util.Date;
public class ESP {
    private boolean isImportant;

    public Date execute() {
        return new Date();
    }

    public Date repair() {

        return new Date();
    }

    public boolean isImportant() {
        return isImportant;
    }

    public void setImportant(boolean important) {
        isImportant = important;
    }
}

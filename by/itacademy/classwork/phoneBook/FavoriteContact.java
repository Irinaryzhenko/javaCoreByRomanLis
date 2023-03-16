package by.itacademy.classwork.phoneBook;

import java.util.Set;

public class FavoriteContact extends Contact {
    private int fastCall;
    private String number;

    public FavoriteContact(String name,
                           Set<String> workNumber,
                           Set<String> personalNumber,
                           int fastCall, String number) {
        super(name, workNumber, personalNumber);
        this.fastCall = fastCall;
        this.number = number;
    }

    public int getFastCall() {
        return fastCall;
    }

    public String getNumber() {

        return number;
    }
}

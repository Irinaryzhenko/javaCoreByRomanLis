package by.itacademy.classwork.phoneBook.exeption;

import by.itacademy.classwork.phoneBook.FavoriteContact;

public class FavoriteContactExeption extends RuntimeException {
    public FavoriteContactExeption(String message) {
        super(message);
    }
}

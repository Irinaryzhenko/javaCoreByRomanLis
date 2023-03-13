package by.itacademy.classwork.phoneBook;

import by.itacademy.classwork.phoneBook.exeption.ChangeContactExeption;

import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook(new HashMap<>());

        Contact roman = new Contact("Roman", new HashSet<>(), new HashSet<>());
        phoneBook.addContact(roman);
        System.out.println(phoneBook);

        roman.setName("New name");
        try {
            phoneBook.changeContact("Roman",roman);

        } catch (ChangeContactExeption e) {
            System.out.println("Can not change the contact: " + roman);
        }
        System.out.println(phoneBook);
    }
}

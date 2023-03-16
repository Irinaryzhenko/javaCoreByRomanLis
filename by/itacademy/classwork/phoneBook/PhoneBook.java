package by.itacademy.classwork.phoneBook;

import by.itacademy.classwork.phoneBook.exeption.AddContactExeptions;
import by.itacademy.classwork.phoneBook.exeption.ChangeContactExeption;
import by.itacademy.classwork.phoneBook.exeption.FavoriteContactExeption;
import com.sun.source.tree.BreakTree;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
   private Map<String, Contact> contacts;
   private Map<Integer, FavoriteContact> favoriteContacts = new HashMap<>();

    public PhoneBook(Map<String, Contact> contacts) {
        this.contacts = contacts;
    }
    public Contact addContact(Contact contact) {
        if (contact == null) {
            throw new AddContactExeptions("Contact is null");
        }
        if (contacts.containsKey(contact.getName())) {
                throw new AddContactExeptions(
                "Contact with name" + contact.getName() + " already exist.");
    }
    return contacts.put(contact.getName(), contact);

}

    public Contact removeContact (String name)  {
        if(name == null) {
            throw new IllegalArgumentException("Name is null");
        }
        return contacts.remove(name);

    }
    public Contact changeContact(String oldName, Contact contact) throws ChangeContactExeption{

        if (contact == null || oldName == null) {
            throw new IllegalArgumentException ("Contact is null");
        }
        if (!contacts.containsKey(oldName)) {
            throw new ChangeContactExeption(
                    "Contact with name" + oldName + " not exist.");
        }
        if (!oldName.equals(contact.getName())) {
            if(contacts.containsKey(contact.getName())) {
                throw new ChangeContactExeption("Contact with name " + contact.getName() + " already exist.");
        }
        contacts.remove(oldName);
            return contacts.put(contact.getName(), contact);
    }
        return contacts.replace(contact.getName(),contact);
    }
    public Contact moveToFavorite (String name, String number, int fastCall) {
        if (name == null || number == null) {
            throw new IllegalArgumentException("Contact or name is null");

        }
        Contact contact = contacts.get(name);
        if (contact == null) {
            throw new FavoriteContactExeption("Contact " + name + " not exist.");
        }
        if (favoriteContacts.containsKey(fastCall)) {
            throw new FavoriteContactExeption("Hot key "+ fastCall + " already in use.");
        }

        FavoriteContact favoriteContact= new FavoriteContact(name,
                contact.getWorkNumber(),
                contact.getPersonalNumber(),
                fastCall,
                number);
    return favoriteContacts.put(fastCall, favoriteContact);
    }
    public Contact removeFavoriteContact (int fastCall){
        if (!favoriteContacts.containsKey(fastCall)) {
            throw new FavoriteContactExeption("Hot key " + fastCall + " not in use");
        }
        return favoriteContacts.remove(fastCall);

    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "contacts=" + contacts +
                ", favoriteContacts=" + favoriteContacts +
                '}';
    }
}

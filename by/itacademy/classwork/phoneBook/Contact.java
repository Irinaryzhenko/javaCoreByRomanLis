package by.itacademy.classwork.phoneBook;

import java.util.Set;

public class Contact {
    private String name;
    private Set<String> workNumber;
    private Set<String> personalNumber;

    public Contact(String name,
                   Set<String> workNumber,
                   Set<String> personalNumber) {
        this.name = name;
        this.workNumber = workNumber;
        this.personalNumber = personalNumber;
    }
    public boolean addNumber (String number, NumberType type) {
        if (type == NumberType.PERSONAL) {
            return  personalNumber.add(number);
        }
        return  workNumber.add(number);
    }
    public boolean removeNumber (String number, NumberType type) {
        if (type == NumberType.PERSONAL) {
            return personalNumber.remove(number);
        }
        return workNumber.remove(number);
    }
    public boolean updateNumber (String oldNumber,
                                 String newNumber,
                                 NumberType type) {
        if (type == NumberType.PERSONAL) {
                return update(oldNumber, newNumber, personalNumber);
            }
            return update(oldNumber, newNumber, workNumber);
        }

    private boolean update(String old, String newNumber, Set<String> numbers) {
        if (numbers.remove(old)) {
            return numbers.add(newNumber);
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getWorkNumber() {
        return workNumber;
    }

       public Set<String> getPersonalNumber() {
        return personalNumber;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", workNumber=" + workNumber +
                ", personalNumber=" + personalNumber +
                '}';
    }
}

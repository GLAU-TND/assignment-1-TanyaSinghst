package personADT;

public interface ContactlistADT<Person> {
    boolean add(Person person);

    boolean delete(int index);

    void search(String name);

    void viewAllContacts();
}

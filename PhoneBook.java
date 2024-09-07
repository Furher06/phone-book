import java.util.ArrayList;

public class PhoneBook {
    ArrayList<String> db_names = new ArrayList<>();
    ArrayList<String> db_phone = new ArrayList<>();
    ArrayList<String> db_email = new ArrayList<>();

    PhoneBook(){}

    // Вивести імена всіх контактів
    void showAllContacts() {
        for (String name : db_names) {
            System.out.println(name);
        }
    }

    // Створення контакта
    void addContact(String name, String phone) {
        db_names.add(name);
        db_phone.add(phone);
        db_email.add("");
    }
    void addContact(String name, String phone, String email) {
        db_names.add(name);
        db_phone.add(phone);
        db_email.add(email);
    }

    // Знаходження id контакта по імені, або телефону
    int getId(String contact) {
        if (db_names.contains(contact)) {
            return db_names.indexOf(contact);
        }
        else if (db_phone.contains(contact)) {
            return db_phone.indexOf(contact);
        }
        else {
            return -1;
        }
    }

    // Видалення контакта
    void removeContact(int contact_id) {
        db_names.remove(contact_id);
        db_phone.remove(contact_id);
//        db_email.remove(contact_id);
    }

    // Редагування імені контакта
    void editContactName(int contact_id, String new_name) {
        db_names.set(contact_id, new_name);
    }

    // Редагування телефона контакта
    void editContactPhone(int contact_id, String new_phone) {
        db_phone.set(contact_id, new_phone);
    }
}

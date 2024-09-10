import java.util.ArrayList;

public class PhoneBook {
   ArrayList<String> db_names = new ArrayList<>();
   ArrayList<String> db_phone = new ArrayList<>();
   ArrayList<String> db_email = new ArrayList<>();

   PhoneBook(){}

   // Вивести імена всіх контактів
   void showAllContacts() {
	  System.out.println("All contacts:");
	  for (String name : db_names) {
		 System.out.println(name);
	  }
   }

   // Створення контакта
   void addContact(String name, String phone) {
	  db_names.add(name);
	  db_phone.add(phone);
	  db_email.add("");
	  System.out.println("Contact " + name + " added");
   }
   void addContact(String name, String phone, String email) {
	  db_names.add(name);
	  db_phone.add(phone);
	  db_email.add(email);
	  System.out.println("Contact " + name + " added");
   }

   // Знаходження id контакта по імені, або телефону
   int getId(String contact) {
	  // Отримання id по імені
	  if (db_names.contains(contact)) {
		 return db_names.indexOf(contact);
	  }
	  // Отримання id по номеру телефона
	  else if (db_phone.contains(contact)) {
		 return db_phone.indexOf(contact);
	  }
	  // Отримання id по адресі елетронної пошти
	  else if (db_email.contains(contact)) {
		 return db_email.indexOf(contact);
	  }
	  else {
		 return -1;
	  }
   }

   // Видалення контакта
   void removeContact(int contact_id) {
	  db_names.remove(contact_id);
	  db_phone.remove(contact_id);
	  db_email.remove(contact_id);
	  System.out.println("Contact " + db_names.get(contact_id) + " deleted");
   }

   // Редагування імені контакта
   void editContactName(int contact_id, String new_name) {
	  db_names.set(contact_id, new_name);
	  System.out.println("The contact's name has been changed");
   }
   // Редагування номера телефона контакта
   void editContactPhone(int contact_id, String new_phone) {
	  db_phone.set(contact_id, new_phone);
	  System.out.println("The contact's phone number has been changed");
   }
   // Редагування адреси електронної пошти контакта
   void editContactEmail(int contact_id, String new_email) {
	  db_phone.set(contact_id, new_email);
	  System.out.println("The contact's email has been changed");
   }
}

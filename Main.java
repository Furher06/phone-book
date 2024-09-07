import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook();
        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.print("Enter action:\n1) Show all contacts\n2) Add new contact\n3) Remove contact\n4) Edit contact\n--> ");
            switch (input.nextLine()){
                case "1":
                    pb.showAllContacts();
                    break;
                case "2":
                    System.out.print("Write the name\n--> ");
                    String name = input.nextLine();
                    System.out.print("Write the phone number\n--> ");
                    String phone = input.nextLine();
                    pb.addContact(name, phone);
                    break;
                case "3":
                    System.out.print("Enter a name or phone number \n--> ");
                    String contact = input.nextLine();
                    pb.removeContact(pb.getId(contact));
                    break;
            }
        }
    }
}

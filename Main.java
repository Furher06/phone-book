import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
	  PhoneBook pb = new PhoneBook();
//	  pb.addContact("Alex", "001");
//	  pb.addContact("Bob", "005");
//	  pb.addContact("Storm", "004");
//	  pb.addContact("Jackson", "002");
//	  pb.addContact("Patrik", "003");

	  String contact;

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
			   System.out.print("Write the email\n--> ");
			   String email = input.nextLine();
			   pb.addContact(name, phone, email);
			   break;
			case "3":
			   System.out.print("Enter contact \n--> ");
			   contact = input.nextLine();
			   pb.removeContact(pb.getId(contact));
			   break;
			case "4":
			   System.out.print("Enter contact \n--> ");
			   contact = input.nextLine();
			   System.out.print("Choose what to change:\n1) Name\n2) Phone\n3) Email\n--> ");
			   switch (input.nextLine()){
				  case "1":
					 System.out.println("Enter a new name\n--> ");
					 String newName = input.nextLine();
					 pb.editContactName(pb.getId(contact), newName);
					 break;
				  case "2":
					 System.out.println("Enter a new phone\n--> ");
					 String newPhone = input.nextLine();
					 pb.editContactName(pb.getId(contact), newPhone);
					 break;
				  case "3":
					 System.out.println("Enter a new email\n--> ");
					 String newEmail = input.nextLine();
					 pb.editContactName(pb.getId(contact), newEmail);
					 break;
			   }
			   break;
		 }
	  }
   }
}

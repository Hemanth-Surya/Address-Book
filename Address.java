import java.util.ArrayList;
import java.util.Scanner;

import interfaces.AddressBookManagerInterface;

public class Address {
	String firstname;
	String lastname;
	String address;
	String city;
	String state;
	int zipcode;
	String phonenumber;
	Scanner sc=new Scanner(System.in);

	ReadWrite RW=new ReadWrite();

	public void newAddressBook() {
		ArrayList<PersonInfo> personarraylist=new ArrayList<PersonInfo>();
		System.out.println("create a file with .csv extension");
		String Filename=sc.next();
		System.out.println("please enter the no of persons to add");
		int noofpersons=sc.nextInt();
		for(int i=1;i<=noofpersons;i++) {
			System.out.println("Enter Firstname :");
			firstname=sc.next();
			System.out.println("Enter Lastname :");
			lastname=sc.next();
			System.out.println("Enter address:");
			address=sc.next();
			System.out.println("Enter city:");
			city=sc.next();
			System.out.println("Enter state:");
			state=sc.next();
			System.out.println("Enter zipcode:");
			zipcode=sc.nextInt();
			System.out.println("Enter mobilenumber");
			phonenumber=sc.next();
		   personarraylist.add(new PersonInfo(firstname,lastname,address,city,state,zipcode,phonenumber));
		   try {
			RW.Writecsv(Filename, personarraylist);
		} catch (Throwable e) {

			e.printStackTrace();
		}
		}

	}

	public void openAddressBook() {


	}


	public void saveAddressBook(String Filename, ArrayList<PersonInfo> save){

	}

	@Override
	public void saveAsAddressBook(String oldfile, String newfile) throws Throwable {

	}
	public void closeAddressBook() {
	}
	public void quitAddressBook() {
	}
}

import java.util.ArrayList;
import java.util.List;

public class AddressBook {

	private List<BuddyInfo> buddyList;

	public AddressBook() {
		buddyList = new ArrayList<BuddyInfo>();
	}

	public void addBuddy(BuddyInfo b) {
		buddyList.add(b);
	}

	public void removeBuddy(BuddyInfo b) {
		buddyList.remove(b);
	}
	
	public void displayAddressBook(){
		for(BuddyInfo b: buddyList){
			System.out.println(b.toString());
		}
	}
	
	public static void main(string args[]){
		BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", 1234)
		AddressBook.addressBook = new AddressBook();
		addressBook.addBuddy(buddy);
		addressBook.removeBuddy(0);
	}
	
}

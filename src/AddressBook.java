import java.util.LinkedList;

public class AddressBook {
    private LinkedList<BuddyInfo> buddies;

    public AddressBook(){
        buddies = new LinkedList<>();
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
        BuddyInfo bud1 = new BuddyInfo("Tom", "Carleton", 343);
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(bud1);
        addressBook.removeBuddy(bud1);
        addressBook.removeBuddy(bud1);
    }

    public void addBuddy(BuddyInfo bud){
        buddies.add(bud);
    }

    public void removeBuddy(BuddyInfo bud){
        if (!buddies.isEmpty()) {
            buddies.remove(bud);
        }
    }
}

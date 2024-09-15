import java.util.LinkedList;

public class AddressBook {
    private LinkedList<BuddyInfo> buddies;

    public AddressBook(){
        buddies = new LinkedList<>();
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
    }

    public void addBuddy(BuddyInfo bud){
        buddies.add(bud);
    }

    public void removeBuddy(BuddyInfo bud){
        buddies.remove(bud);
    }
}

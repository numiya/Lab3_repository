public class BuddyInfo {

    private String name;
    private String address;
    private int phoneNumber;

    public static void main(String[] args) {
        BuddyInfo person = new BuddyInfo();
        System.out.println("Hello " + person.getName() + "!");
        person.setName("Numiya");
        System.out.println("Hello " + person.getName() + "!");
    }

    public BuddyInfo() {
        this("Default", "Some place", 1234567890);
    }

    public BuddyInfo(String name, String address, int phoneNumber){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}

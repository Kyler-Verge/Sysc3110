import java.util.ArrayList;

public class AddressBook {

    //Create BuddyInfo array list
    private ArrayList<BuddyInfo> addressBook;

    //Constructor
    public AddressBook() {
        addressBook = new ArrayList<>();
    }

    //Add a buddy to the array list
    public void addBuddy(BuddyInfo bud) {
        addressBook.add(bud);
    }

    //remove a buddy to the array list
    public void removeBuddy(BuddyInfo bud) {
        addressBook.remove(bud);
    }

    //main method
    public static void main(String[] args){
        System.out.println("Address Book");
    }

}

/*
AddressBook class
Contains a AddressBook (ArrayList)
That stores BuddyInfo's. Can add
or remove BuddyInfo's from a book.
 */

import java.util.ArrayList;

public class AddressBook {
    
    //This has been edited in Github

    //Create BuddyInfo array list
    private ArrayList<BuddyInfo> addressBook;

    //Constructor
    public AddressBook() {
        addressBook = new ArrayList<>();
    }

    //New method
    public int NewMethod(){
        return 1;
    }

    //Add a buddy to the array list
    public void addBuddy(BuddyInfo bud) {
        if (bud != null) {
            addressBook.add(bud);
        }
    }

    //remove a buddy to the array list
    public BuddyInfo removeBuddy(int index) {
        if (index >= 0 && index < addressBook.size()) {
            return addressBook.remove(index);
        }
        return null;
    }

    //main method
    public static void main(String[] args){
        BuddyInfo buddy = new BuddyInfo("Tom","Carleton","613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);
    }
}

public class MobilePhone {
    private int contactCapacity;
    private int currentContactCount;
    private String[] names;
    private int[] numbers;

    public void setContactCapacity(int capacity) {
        this.contactCapacity = capacity;
        names = new String[capacity];
        numbers = new int[capacity];
        currentContactCount = 0;
    }

    public void addContact(String name, int number) {
        if (currentContactCount < contactCapacity) {
            names[currentContactCount] = name;
            numbers[currentContactCount] = number;
            currentContactCount++;
        } else {
            System.out.println("Contact list is full.");
        }
    }

    public void makeCall(int number) {
        boolean found = false;
        for (int i = 0; i < currentContactCount; i++) {
            if (numbers[i] == number) {
                System.out.println("Calling " + names[i] + "...");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Number not found in contact list.");
        }
    }

    public void details() {
        System.out.println("Contact Capacity: " + contactCapacity);
        System.out.println("Number of Contacts Stored: " + currentContactCount);
    }
}

public class BankAccount {
    public int acNo;
    public String type = "Not Set ";


    public String printDetails() {

        return "Account No = " + type + "\nType = " + type;


    }

    public void setInfo(int a, String b) {
        this.acNo = a;
        this.type = b;
        System.out.println("Account information updated!");

    }
}

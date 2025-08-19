public class TaxiLagbe {
    public String txno;
    public String ares;
    public int tope=0;
    public String[] pgl;
    public int tocf=0;

public void storeInfo(String a, String b){
    this.txno=a;
    this.ares=b;
    pgl=new String[5];
}

public void addPassenger(String n,int f) {

    if (tope < 4) {
        this.pgl[tope] = n;

        tope++;
        tocf += f;
        System.out.println("Dear " + n + "! .Welcome to TaxiLagbe");
    } else {
        System.out.println("Taxi Full! No more passengers can be added");
    }
}

    public void addPassenger(String n,int f,String n1,int f1){
        if(tope<4) {
            this.pgl[tope] = n;

            tope++;
            tocf += f;
            System.out.println("Dear " + n + "! .Welcome to TaxiLagbe");
        }else {
            System.out.println("Taxi Full! No more passengers can be added");
        }
        if(tope<4) {
            this.pgl[tope] = n1;

            tope++;
            tocf += f1;
            System.out.println("Dear " + n1 + "! .Welcome to TaxiLagbe");
        }else {
            System.out.println("Taxi Full! No more passengers can be added");
        }
    }
public void printDetails() {
    System.out.println("Taxi number:" + txno);
    System.out.println("This taxi can cover " + ares + " area");
    System.out.println("Total Passenger: " + tope);
    System.out.println("Passenger Lists:");
    for (int i = 0; i < tope; i++) {
        System.out.print(pgl[i]+" ");
    }
    System.out.println("\nTotal collected fare: " + tocf);



}



}

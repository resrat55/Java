public class Parcel {
    public String name;
    public int weight;
    public double total;

    public Parcel() {
        weight = 0;
        total = 0.0;
    }

    public Parcel(String a) {
        name = a;
        weight = 0;
        total = 0.0;
    }

    public Parcel(String a, int b) {
        name = a;
        weight = b;
        total = 0.0;
    }

    public void calcFee(String a) {
        if (weight == 0) {
            total = 0.0;
        } else {
            int c = a.equals("Dhanmondi") ? 50 : 0;
            total = (weight * 20) + c;
        }
    }

    public void addWeight(int a) {
        weight += a;
        System.out.println("Updated Weight: " + weight);
    }

    public void printDetails() {
        if (name == null) {
            System.out.println("Set name first");
        } else {
            System.out.println("Name: " + name);
            System.out.println("Total Weight: " + weight);
            System.out.println("Total Fee: " + total);
        }
    }
}

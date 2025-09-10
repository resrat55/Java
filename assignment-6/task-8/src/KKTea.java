public class KKTea extends Tea {
    protected int nBag;
    protected int wt;
    protected static int tSale = 0;
    protected static int rSale = 0;

    public KKTea(int b, int a) {
        super("KK Regular Tea", b);
        this.nBag = a;
        this.wt = a * 2;
    }

    @Override
    public void productDetail() {
        System.out.println("Name: " + name + ", Price: " + price);
        System.out.println("Status: " + status);
        System.out.println("Weight: " + wt + ", Tea Bags: " + nBag);
    }

    public static void updateSoldStatusRegular(KKTea t) {
        if (!t.status) {
            t.status = true;
            tSale++;
            rSale++;
        }
    }

    public static void totalSales() {
        System.out.println("Total Sales: " + tSale);
        System.out.println("KK Regular Tea: " + rSale);
    }

    protected static void addFlavouredSale() {
        tSale++;
    }
}



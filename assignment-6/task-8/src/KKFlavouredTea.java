public class KKFlavouredTea extends KKTea {
    private String flav;
    private static int fSale = 0;

    public KKFlavouredTea(String c, int b, int a) {
        super(b, a);
        this.flav = c;
        this.name = "KK " + c + " Tea";
    }

    @Override
    public void productDetail() {
        System.out.println("Name: " + name + ", Price: " + price);
        System.out.println("Status: " + status);
        System.out.println("Weight: " + wt + ", Tea Bags: " + nBag);
    }

    public static void updateSoldStatusFlavoured(KKFlavouredTea t) {
        if (!t.status) {
            t.status = true;
            fSale++;
            addFlavouredSale();
        }
    }

    public static void totalSales() {
        System.out.println("Total Sales: " + (rSale + fSale));
        System.out.println("KK Regular Tea: " + rSale);
        System.out.println("KK Flavoured Tea: " + fSale);
    }
}
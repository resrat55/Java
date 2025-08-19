public class Cart {
    public int cno;
    public String[] name=new String[3];
    public double[] price= new double[3];
    public double tcost;
    public double dis=0.0;
    public int c=0;


    public void create_cart(int a){
        this.cno=a;

    }
    public void addItem(String name, double p){
        if(c<3){
            this.name[c]=name;
            this.price[c]=p;
            this.tcost+=p;
            c++;
            System.out.println(name+" added to cart "+cno+".");
            System.out.println("You have "+c+" item(s) in your cart now.");

        }else {
            System.out.println("You already have 3 items on your cart");
        }
    }
    public void addItem(double p,String name ){
        if(c<3){
            this.name[c]=name;
            this.price[c]=p;
            this.tcost+=p;
            c++;
            System.out.println(name+" added to cart "+cno+".");
            System.out.println("You have "+c+" item(s) in your cart now.");

        }else {
            System.out.println("You already have 3 items on your cart");
        }
    }


    public void cartDetails(){
        System.out.println("Your cart(c"+cno+") :");
        for (int i=0;i<c;i++){
            System.out.println(name[i]+" -"+ price[i]);
        }
        System.out.println("Discount Applied: "+dis+"%");
        System.out.println("Total price: "+tcost);
    }
    public void giveDiscount(double d){
        this.dis=d;
        double dp=((d/100)*tcost);
        tcost=tcost-dp;
    }




}

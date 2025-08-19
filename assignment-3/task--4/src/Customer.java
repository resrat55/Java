public class Customer {
    public String name;
    public String[] item=new String[4];
    public int[] price =new int[4];
    public int totol=0;
    public int c=0;


    public void createCustomer(String n){
        this.name=n;

    }
    public void showCart(){
        System.out.println("Customer: "+name);
        if(! name.isEmpty() ){
            for(int i=0;i<c;i++){
                System.out.println("Item: "+item[i]+" Price : "+ price[i]);

            }

        }
    }


    public void addItem(String it,int pr){
        if(c<4){
            this.item[c]=it;
            this.price[c]=pr;
            this.totol+=pr;
            ++c;
            System.out.println(it+" added to cart");

        }else System.out.println("Cart is full");


    }
    public void addItem(String it,int pr,String it1,int pr1){
        if(c%2==0 && c<=3){
            this.item[c]=it;
            this.price[c]=pr;
            this.totol+=pr;
            ++c;


            this.item[c]=it1;
            this.price[c]= pr1;
            this.totol+=pr1;
            ++c;
            System.out.println(it+" and "+it1+" added to cart");

        }else if(c<4){
                this.item[c]=it;
                this.price[c]=pr;
                this.totol+=pr;
                ++c;
                System.out.println(it+" added to cart");



        }
        else {
            System.out.println("Cart is full");
        }


    }

    public void calculatePrice(){
        System.out.println("Total: "+totol);
    }


}

public class CustomerService {
    private String[] customer;
    private int count=0;
    public CustomerService(int a){
        customer=new String[a];
    }
    public void serveCustomer(){
        if(count==0){
            System.out.println("No customers to serve");
        }else {
            System.out.println("Serving : "+customer[0]);
            for (int i=0;i<count-1;i++){
                customer[i]=customer[i+1];

            }
            count--;

        }

    }
    public void addCustomer(String a){
        if(count> customer.length-1){
            System.out.println("Queue is full. Cannot add "+a);
        }else {
            customer[count++]=a;
            System.out.println("Added: "+a);
        }
    }
}

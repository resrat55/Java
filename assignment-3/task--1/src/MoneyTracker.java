public class MoneyTracker {
    public String name;
    public double cb;
    public double la;
    public double ls;


    public String info(){
        return "Name :"+name+"\nCurrent Balance: "+cb;

    }
    public void createTracker(String a){
        this.name=a;
        this.cb+=1;
        this.la=1;
    }
    public void income(double i){
        this.cb+=i;
        this.la=i;
        System.out.println("Balance Updated!");
    }
    public void expense(double e){
        if(e>cb){
            System.out.println("Not enough balance.");
        }else{
            cb-=e;
            ls=e;
            if(cb==0){
                System.out.println("You're broke!");
            }else{
                System.out.println("Balance Updated!");}
            }
        }


    public void showHistory(){
        System.out.println("Last added: "+la);
        System.out.println("Last spent: "+ls);
    }

}

public class Manager extends Employee{
    public double fSalary;
    public double  bonus;

    public Manager(String a,double b,int c,int d){
        super(a,b,c);
        bonus=d;
    }
    public Manager(String a,double b,int c){
        super(a,b,c);
    }

    public void requestIncrement(int a){
        if ( getHoursWorked()<=100 && getHoursWorked()>80){
            setBaseSalary((getBaseSalary()+a/2));
            System.out.println("$"+a/2+" Increment approved.");
        } else if (getHoursWorked()>100) {
            setBaseSalary((getBaseSalary()+a));
            System.out.println("$"+a+" Increment approved.");
        }else System.out.println("Increment denied.");
    }
    public void calculateSalary(){
        if(getHoursWorked()<41 ){
            fSalary=getBaseSalary();
        } else {
            fSalary=getBaseSalary()+(getBaseSalary()*(bonus/100.0));

        }
    }
    public void displayInfo(){
        super.displayInfo();;
        System.out.println("Bonus: "+bonus+" %\nFinal Salary: $"+fSalary);
    }
}

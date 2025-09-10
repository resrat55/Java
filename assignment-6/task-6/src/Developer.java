public class Developer extends Employee{
    public String langauge;
    public double fsalary;
    public Developer(String a,double b,int c,String d){
        super(a,b,c);
        langauge=d;
    }
    public void calculateSalary(){
        if(langauge.equals("Java")){
            fsalary=getBaseSalary()+700;
        }else fsalary=getBaseSalary();
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Language: "+langauge+"\nFinal Salary: "+fsalary);
    }
}

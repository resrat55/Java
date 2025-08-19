public class Shape {
    public String name;
    public double area;


    public void setParameters(String name , double a){
        this.name=name;
        this.area=(3.1416*a*a);


    }

    public void setParameters(String name , double a, double b){
        this.name=name;
        if(name=="Triangle"){
            this.area=(.5*a*b);
        }else{
            this.area=(a*b);
        }





    }
    public String details(){

        return "Shape Nmae = "+ name +"\nArea = "+String.format("%.2f",area);
    }
}

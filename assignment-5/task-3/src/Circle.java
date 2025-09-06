public class Circle extends Shape {
//Your Code Here
    public double radius;
    public void displayInfo() {
        super.displayInfo();
    }
    public void area(){
        System.out.println("Area of "+color+" "+name+" :" +3.1416* radius * radius);
    }
}

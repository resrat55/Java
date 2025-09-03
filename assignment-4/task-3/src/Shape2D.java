public class Shape2D {
    public String name="Square";
    public double area=25;
    public  Shape2D(){
        System.out.println("A "+name+" has been created with\nlength: 5");
    }
    public void area(){
        System.out.println("The area of the "+name+" is: \n"+area);
    }
    public Shape2D(int a,int b){
        name="Rectangle";
        area=a*b;

        System.out.println("A "+name+" has been created\nwith length: "+a+" and breadth: "+b);

    }
    public Shape2D(int a,int b,String c){
        name=c;
        area=0.5*a*b;

        System.out.println("A "+name+" has been created\nwith height: "+a+" and base: "+b);
    }
    public Shape2D(int a, int b ,int c){
        name="Triangle";
        double s=(a+b+c)/2;
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));

        System.out.println("A "+name+" has been created\nwith the following sides: "+a+","+b+","+c);
    }



}

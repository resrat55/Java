public class Calculator {
    public void add(int  a,int b){
        System.out.println(a+b);
    }
    public void add(int  a,int b,int c){
        System.out.println(a+b+c);
    }
    public void multiply(int  a,int b){
        System.out.println(a*b);
    }
    public void multiply(int  a,int b,int c){
        System.out.println(a*b*c);
    }
    public void multiply(String  a,int b){

        System.out.print(a);
        for(int i=0;i<b-1;i++){
            System.out.print("-"+a);
        }
        System.out.print("\n");

    }
}

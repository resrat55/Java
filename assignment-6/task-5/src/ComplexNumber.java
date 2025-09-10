public class ComplexNumber extends RealNumber{
    public double imaginary=1.0;
    public ComplexNumber(){
        realValue+=1.0;

    }
    public ComplexNumber(double a,double b){

        super(a);
        imaginary=b;

    }
    public String toString(){

        return super.toString()+"\nImaginaryPart: " + imaginary;
    }
}

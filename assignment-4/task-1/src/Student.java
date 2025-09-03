public class Student {
    public String name,prog;
    public  Student(String a,String b){
        name=a;
        prog=b;

    }
    public void updateName(String a){
        name=a;
    }
    public void updateProgram(String a){
        prog=a;
    }
    public String accessProgram(){
        return prog;
    }

}

public class NubStudent {
    public String name;
    public String live;
    public boolean pass=false;
    public NubStudent(String a, String b){
        name=a;
        live=b;
    }
    public void showDetails(){
        System.out.println("Student Name: "+name+"\nLives in "+live+"\nHave Bus Pass? "+pass);
    }
    public void getPass(){
        pass=true;
    }
    public void getPass(String a){
        live=a;
    }

}

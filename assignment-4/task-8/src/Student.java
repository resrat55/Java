public class Student {
    public String name;
    public String dname;
    public String email=null;
    public String password=null;
    public int id;
    public String[] course=new String[3];
    public  int count=0;
    public boolean status=false;

    public Student(String a,int b,String c){
        name=a;
        id=b;
        dname=c;
        System.out.println("Student object is created");

    }


}

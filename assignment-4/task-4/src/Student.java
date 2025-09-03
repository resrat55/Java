public class Student {
    public int id;
    public double cg;
    public String[] course= new String[4];
    public boolean c=false;
    public int cu=0;
    public Student(int a){
        id=a;
        System.out.println("A student with ID "+id+" has been created.");
    }
    public Student(int a,double b){
        id=a;
        if(b<=4.0){
            cg=b;
            System.out.println("A student with ID "+id+" and cgpa "+cg+" has been created.");
            c=true;
        } else System.out.println("Invalid CG!!\nA student with ID "+id+" has been created.");

    }
    public void addCourse(String a){
        if(!c){
            System.out.println("Failed to add "+a+" Set CG first");
        } else if (cg<3 && cu>2) {
            System.out.println("CG is low. Can't add more than 3 courses.");
            
        }else if (cu<4){
            course[cu++]=a;
        }else System.out.println("Failed to add "+a+" Maximum 4 courses allowed.");
    }
    public void addCourse(String[] a){
        int x= a.length;
        for (int i=0;i<x;i++){
            addCourse(a[i]);
        }
    }
    public void storeCG(double a){
        if(a<=4.0){
            cg=a;
            c=true;
           // System.out.println("A student with ID "+id+" and cgpa "+cg+" has been created.");
        } else System.out.println("Invalid CG!!");
    }
    public void storeID(int a){
        id=a;
    }
    public void removeAllCourse(){
        for(int i=cu;i<=0;i--){
            course[i]=null;
        }
        cu=0;


    }
    public void showAdvisee(){
        System.out.println("Student ID: "+id +", CGPA: "+cg);
        if (cu==0){
            System.out.println("No courses added.");
        }else {
            System.out.println("Added courses are:");
            for (int i=0;i<cu;i++){
                System.out.print(course[i]+" ");
            }
            System.out.print("\n");
        }


    }



}

public class Erp {
    public int tadv=0;
    public Student[] adv=new Student[5];

    public Erp(){
        System.out.println("Erp is ready to use!");
    }
    void adcourse(Student a,String b,String c,String d){


        a.course[a.count++]=b;
        a.course[a.count++]=c;
        a.course[a.count++]=d;
        System.out.println("Advising successful!");
        adv[tadv++]=a;




    }
    public void login(Student a){
        if(a.email==null || a.password==null){
            System.out.println("Email and password need to be set.");
        }else a.status=true; System.out.println("Login successful");


    }
    public void advising(Student a){
        if(a.status==false){
            System.out.println("Please login to advise courses!");
        }else System.out.println("You haven't selected any courses.");
    }
    public void advising(Student a,String b,String c,String d,String e){
        if(a.status==false) {
            System.out.println("Please login to advise courses!");
        }else System.out.println("You need special approval to take\nmore than 3 courses.");
    }
    public void advising(Student a,String b,String c,String d){
        if(a.status==false){
            System.out.println("Please login to advise courses!");
        }else if(tadv<5)adcourse(a,b,c,d); else System.out.println("Can not make advice more then 5 !!");



    }
    public void allAdviseeInfo(){
        System.out.println("Total Advisee: "+tadv);
        for(int i=0;i<tadv;i++){
            Student s=adv[i];
            System.out.println("Name :"+s.name+" ID : "+s.id+"\nDepartment : "+s.dname+"\nAdvised Courses:");
            for (int j=0;j<s.count;j++){
                System.out.printf(s.course[j]+" ");
            }
            System.out.println("");
        }

    }



}

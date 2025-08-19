public class Student {

    public String name="Not Set";
    public String dep="CSE";
    public double cg;
    public int cre=9;
    public String ss="Not Set";
    boolean scl=true;


public void showDetails(){
    System.out.println("Name: "+name);
    System.out.println("Department: "+dep);
    System.out.println("CGPA: "+cg);
    System.out.println("Credits: "+cre);
    System.out.println("Scholarship Status: "+ss);

}

    public void updateDetails(String n,double cg,int cr){
    //boolean scl=true;
    this.name=n;
    if(cg<=4.0 && cg>0.0)this.cg=cg;
    if(cr>0)this.cre=cr;
    if(cg>=3.5 && cg < 3.7 && cr>10){
        this.ss="Need-based scholarship.";
    } else if (cg >=3.7 && cr>10) {
        this.ss="Merit based scholarship.";

    }else {
        this.ss="No scholarship";
        scl=false;
    }
    }

    public void updateDetails(String n,double cg){
        //boolean scl=true;
        this.name=n;
        if(cg<=4.0 && cg>0.0)this.cg=cg;

        if(cg>=3.5 && cg < 3.7 && cre>10){
            this.ss="Need-based scholarship.";
        } else if (cg >=3.7 && cre>10) {
            this.ss="Merit based scholarship.";

        }else {
            this.ss="No scholarship";
            scl=false;
        }
    }
    public void updateDetails(String n,double cg,int cr,String dep){

        this.name=n;
        if(cg<=4.0 && cg>0.0)this.cg=cg;
        if(cr>0)this.cre=cr;
        this.dep=dep;
        if(cg>=3.5 && cg < 3.7 && cr>10){
            this.ss="Need-based scholarship.";
        } else if (cg >=3.7 && cr>10) {
            this.ss="Merit based scholarship.";

        }else {
            this.ss="No scholarship";
            scl=false;
        }
    }

    public void checkScholarshipEligibility(){
        if(scl){
            System.out.println(name+ " is eligible for " + ss);
        }else {
            System.out.println(name+ " is not eligible for scholarship" );
        }

    }



}

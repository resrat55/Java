public class CSEStudent extends Student{
    public static String[] ac={"CSE110","CSE111","CSE220", "CSE221"};
    public static int sno=0;
    public CSEStudent(String a,int b){
        super(a,b);
        sno++;

    }
    public static void details(){
        System.out.println("Total CSE Students: "+sno);
        System.out.println("Available Lab Based Courses: ");
        for(int i=0;i<ac.length;i++){
            System.out.printf(ac[i]+" ");
        }
        System.out.println("");

    }
    public void addLabBasedCourse(String a){
        boolean find=false;
        for(int i=0;i<ac.length;i++){
            if(a==ac[i]){
                find=true;
                courses+=a+" ";
                break;

            }
        }
        if(!find){
            System.out.println("It is not a lab based course!");
        }
    }


}

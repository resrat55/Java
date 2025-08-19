public class Course {
    public String name;
    public String code;
    public String[] syl=new String[4];
    public int cou;

    public void updateDetails(String a, String b){
        this.name=a;
        this.code=b;

    }
    public void addContent(String a){
        if(cou<4) {
            this.syl[cou] = a;
            cou++;
            System.out.println(a + " was added.");
        }else System.out.println("Cannot add more content");
    }
    public void addContent(String a,String b){
        if(cou<4) {
        this.syl[cou]=a;
        cou++;
        System.out.println(a+" was added.");
        }else System.out.println("Cannot add more content");
        if(cou<4) {
        this.syl[cou]=b;
        cou++;
        System.out.println(b+" was added.");
    }else System.out.println("Cannot add more content");
    }
    public void printDetails() {
        System.out.println("Course details:");
        System.out.println("Course Name: " + name);
        System.out.println("Course Code: " + code);
        System.out.println("Course Syllabus: ");
        if (cou == 0) {
            System.out.println("No content yet.");
        } else {


            System.out.print(syl[0]);
            for (int i = 1; i < cou; i++) {
                System.out.print(" ," + syl[i]);
            }
            System.out.print("\n");

        }
    }

}

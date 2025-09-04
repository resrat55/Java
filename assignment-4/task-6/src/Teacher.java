public class Teacher {
    public String name;
    public String initial;
    public String [] clist=new String[3];
    public int count=0;
    public Teacher(String a,String b){
        name=a;
        initial=b;
        System.out.println("A new teacher has been created");
    }
    public void addCourse( Course a) {
        if(count <3){
            clist[count++]=a.name;
        }
    }
    public void printDetail(){
        System.out.println("Name: "+name+"\nInitial: "+initial+"\nList of courses:");
        for(int i=0;i<count;i++){
            System.out.println(clist[i]);
        }

    }



}

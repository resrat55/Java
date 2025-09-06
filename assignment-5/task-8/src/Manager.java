public class Manager extends SportsPerson{
    public int win;


    public Manager(String a,String b,String c,int d){
        super(a,b,c);
        win=d;
        earningPerMatch=win*1000;

    }
    public void printDetails(){
        System.out.println(getNameTeam());
        System.out.println("Team Role: "+role+"\nTotal Win:"+win+"\nMatch Earning: "+earningPerMatch+"K");

    }
}

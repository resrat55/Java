public class Player extends SportsPerson{
    public int tg;
    public int tm;
    public float ratio;


    public Player(String a,String b,String c,int d,int e){
        super(a,b,c);
        tg=d;
        tm=e;

        earningPerMatch=(tg*1000)+(tm*10);
    }
    public void calculateRatio(){
        ratio=tm/tg;
    }
    public void printDetails(){
        System.out.println(getNameTeam());
        System.out.println("Team Role: "+role+"\nTotal Goal: "+tg+", Total Played: "+tm+"\nGoal Ratio: "+ratio+"\nMatch Earning: "+earningPerMatch+"K");

    }
}

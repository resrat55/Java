public class Cricket_Tournament extends Tournament {
    public int tnum=0;
    public String type="No type";
    public Cricket_Tournament(){

    }
    public Cricket_Tournament(String a,int b,String c){
        setName(a);
        tnum=b;
        type=c;

    }
    public String  detail(){
        return "Cricket Tournament Name: "+getName()+"\nNumber of Teams: "+tnum+"\nType: "+type;
    }

}

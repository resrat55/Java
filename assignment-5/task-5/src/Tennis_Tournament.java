public class Tennis_Tournament extends Tournament{
    public int nump=0;
    public Tennis_Tournament(String a,int b){
        setName(a);
        nump=b;

    }
    public String detail(){
        return "Tennis Tournament Name: "+getName()+"\nNumber of Players: "+nump;
    }



}
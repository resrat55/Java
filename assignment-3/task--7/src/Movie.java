public class Movie {
    public String title;
    public String dir;
    public double rate;
    public String[] actor=new String[100];
    public int cou = 0;

    public void setMovieDetails(String a, String b, double c) {
        this.title = a;
        this.dir = b;
        this.rate = c;
    }
    public void setMovieDetails(String a, String b) {
        this.title = a;
        this.dir = b;
    }
    public void addActors(String a,String b, String c){
        this.actor[cou]=a;
        System.out.println("Added actor \""+a+"\" to \"" +title+"\".");
        cou++;
        this.actor[cou]=b;
        System.out.println("Added actor \""+b+"\" to \"" +title+"\".");
        cou++;
        this.actor[cou]=c;
        System.out.println("Added actor \""+c+"\" to \"" +title+"\".");
        cou++;


    }
    public void addActors(String a,String b){
        this.actor[cou]=a;
        System.out.println("Added actor \""+a+"\" to \"" +title+"\".");
        cou++;
        this.actor[cou]=b;
        System.out.println("Added actor \""+b+"\" to \"" +title+"\".");
        cou++;



    }
    public void addActors(String a){
        this.actor[cou]=a;
        System.out.println("Added actor \""+a+"\" to \"" +title+"\".");
        cou++;

    }
    public void showInfo(){
        System.out.println("Title : "+title);
        System.out.println("Director : "+dir);
        System.out.println("Rating : "+rate);
        System.out.print("Actors : ");
        System.out.print(actor[0]);
        for(int i=1;i<cou;i++){
            System.out.print(" ,"+actor[i]);
        }
        System.out.print("\n");


    }
    public void updateRating(double a){
        this.rate=a;
        System.out.println("Updated rating of \""+title+"\" to "+a);
    }



}

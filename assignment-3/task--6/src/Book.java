public class Book {
    public String title;
    public String genre;
    public String author="Unknown";
    public int page;


    public void createBook(String a){
        this.title=a;
    }
    public void createBook(String a, String b){
        this.title=a;
        this.author=b;

    }
    public void createBook(String a,String b,String c){
        this.title=a;
        this.author=b;
        this.genre =b;

    }
    public void createBook(String a,String b,String c,int d){
        this.title=a;
        this.author=b;
        this.genre =c;
        this.page=d;

    }
    public void customizeGenre(String a){
        this.genre=a;
    }
    public void customizePages(int a){
        this.page=a;
    }
    public void customizeTitle(String a){
        this.title=a;
    }
    public void customizeAuthor(String a){
        this.author =a;
    }
    public void displayDetails(){
        System.out.println("Title: "+title+", Author: " +author+ ", Genre: "+genre+", Pages: "+page);
    }



}

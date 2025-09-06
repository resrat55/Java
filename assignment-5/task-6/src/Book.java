public class Book extends Product{
    public String isbn;
    public String publishar;
    public Book(int a,String b,int c,String d,String e){
        super(a,b,c);
        isbn=d;
        publishar=e;

    }
    public String  printDetail(){
        return getIdTitlePrice()+"\nISBN: "+isbn+" Publisher:"+publishar;
    }
}

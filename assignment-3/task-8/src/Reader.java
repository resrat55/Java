public class Reader {
    public String name="New user";
    public int cap=0;
    public String[] book;
    public int bcon=0;


    public String createReader(String a, int b){
        this.name=a;
        this.cap=b;
        book=new String[cap];
        return "A new reader is created!";

    }
    public void readerInfo(){
        System.out.println("Name: "+name);
        System.out.println("Capacity: "+cap);
        System.out.println("Books:");
        if(bcon>0) {
            for (int i = 0; i < bcon; i++) {
                System.out.println("Book " + (i+1) + ": " + book[i]);
            }
        }else {
            System.out.println("No books added yet");
        }
    }

    public void addBook(String bn){
        if(bcon<cap){
            this.book[bcon++]=bn;
        }else {
            System.out.println("No more capacity");
        }

    }


}

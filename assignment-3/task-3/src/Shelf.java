public class Shelf {
    public int capacity;
    public int Bno;

    public void showDetails(){
        System.out.println("Shelf capacity: "+ capacity);
        System.out.println("Number of books: "+Bno);
    }
    public void addBooks(int a){
        int add= capacity -Bno;
        if(capacity ==0){
            System.out.println("Zero capacity. Cannot add books.");
        }
        else if(add<=a){
            this.Bno=a;
            System.out.println(a+" books added to shelf");
        }else {
            System.out.println("Exceeds capacity");
        }
    }


}

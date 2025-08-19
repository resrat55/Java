import java.util.Arrays;

public class Library {
    public int mc;
    public int tb;
    public String[] bl;
    //int bc=0;


    public void setBookCapacity(int a){
        this.mc=a;
        bl =new String[mc];
    }
    public void addBook(String bn){

        if (tb < mc) {
            this.bl[tb++] = bn;
            System.out.println("Book "+bn+" added to the library");
        } else {
            System.out.println("Exceeds maximum capacity. You can't add more than " + mc + " books");
        }


    }
    public void printDetail(){
        System.out.println("Maximum Capacity: "+mc);
        System.out.println("Total Books: "+tb);
        System.out.println("Book list: ");
        for (int i = 0; i < tb; i++) {
            System.out.println(bl[i]);
        }
    }
}

public class Dog extends Animal{
    public String name;

    @Override
    public void details() {
        super.details();
    }
    public String getName(){
        return name;
    }
    public void updateSound(String a){
        sound=a;
    }
}

public class NubStudentTester {
    public static void main(String[] args) {
        NubStudent st1 = new NubStudent("Afif", "Mirpur");
        System.out.println("1===============");
        NubStudent st2 = new NubStudent("Shanto", "Motijheel");
        NubStudent st3 = new NubStudent("Taskin", "Mirpur");
        st1.showDetails();
        st2.showDetails();
        System.out.println("2===============");
        st3.showDetails();
        System.out.println("3===============");
        NubBus bus1 = new NubBus("Mirpur");
        NubBus bus2 = new NubBus("Azimpur", 5);
        bus1.showDetails();
        bus2.showDetails();
        System.out.println("4===============");
        st2.getPass();
        st3.getPass();
        System.out.println("5===============");
        st2.showDetails();
        st3.showDetails();
        System.out.println("6===============");
        bus1.board();
        System.out.println("7===============");
        bus1.board(st1, st2);
        System.out.println("8===============");
        st1.getPass();
        st2.getPass("Mirpur");
        st1.showDetails();
        st2.showDetails();
        System.out.println("9===============");
        bus1.board(st1);
        bus1.board(st2, st3);
        System.out.println("10===============");
        bus1.showDetails();
    }
}
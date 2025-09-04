public  class Team {
    public String name;
    public Player[] p = new Player[10];
    public int tp = 0;
    public Team() {
        name=null;
    }
    public Team(String a) {
        name = a;
    }
    public void updateName(String a) {
        name = a;
    }

    public void addPlayer(Player p) {
        if (tp < this.p.length) {
            this.p[tp] = p;
            tp++;
        }
    }
    public void printDetail() {
        System.out.println("Team: " + name);
        System.out.println("List of players:");
        for (int i = 0; i < tp; i++) {
            Player p = this.p[i];
            System.out.println("Name: " + p.name);
            System.out.println("Age: " + p.age + ", Total Matches: " + p.tm);
        }
    }
}

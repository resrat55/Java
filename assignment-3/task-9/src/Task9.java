public class Task9 {
    public int temp = 4;
    public int sum;
    public int y;
    public int x;

    public void methodA(int m){
        int [] n = {2,5};
        int x = 0;
        y = y + m + this.methodB(x, m++) + (temp) + y;
        x = this.x + 2 + (++n[0]);
        sum = sum + x + y;
        n[0] = sum + 2;
        System.out.println(n[0] + x + "\t\t" + y+ "\t\t" + sum);
    }

    public int methodB(int m, int n){
        int [] y = {1};
        this.y = y[0] + this.y + m;
        x = this.y + 2 + temp - n;
        sum = x + y[0] + this.sum;
        System.out.println( y[0]+ x + "\t\t" + y[0] + "\t\t" +sum);
        return y[0];
    }
}


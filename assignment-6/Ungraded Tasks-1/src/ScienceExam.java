public class ScienceExam extends Exam {
    public int nPart;
    public String[] sub;

    public ScienceExam(int a, int b, String c) {
        super(a);
        this.time = b;
        this.sub = c;
        this.nPart = 2 + c.length;
    }

    @Override
    public String examSyllabus() {
        String s = "Maths, English";
        for (String x : sub) {
            s += ", " + x;
        }
        return s;
    }

    @Override
    public String examParts() {
        String s = "Part 1 - Maths\nPart 2 - English\n";
        for (int i = 0; i < sub.length; i++) {
            s += "Part " + (i + 3) + " - " + sub[i] + "\n";
        }
        return s;
    }

    @Override
    public String toString() {
        return "Marks: " + marks + " Time: " + time + " minutes Number of Parts: " + nPart;
    }
}
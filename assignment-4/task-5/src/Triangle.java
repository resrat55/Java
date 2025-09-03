public class Triangle {
   public int a;
    public int b;
    public int c;

    public Triangle(int x, int y, int z) {
        a = x;
        b = y;
        c = z;
    }

    public void triangleDetails() {
        int p = a + b + c;
        System.out.println("Three sides of the triangle are: " + a + ", " + b + ", " + c);
        System.out.println("Perimeter: " + p);
    }

    public String printTriangleType() {
        if (a == b && b == c) {
            return "This is an Equilateral Triangle.";
        } else if (a == b || b == c || a == c) {
            return "This is an Isosceles Triangle.";
        } else {
            return "This is a Scalene Triangle.";
        }
    }

    public void compareTriangles(Triangle t) {
        if (this == t) {
            System.out.println("These two triangle objects have the same address.");
            return;
        }

        int p1 = a + b + c;
        int p2 = t.a + t.b + t.c;

        if (a == t.a && b == t.b && c == t.c) {
            System.out.println("Addresses are different but the sides of the triangles are equal.");
        } else if (p1 == p2) {
            System.out.println("Only the perimeter of both triangles is equal.");
        } else {
            System.out.println("Addresses, length of the sides and perimeter all are different.");
        }
    }
}

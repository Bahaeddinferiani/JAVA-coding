class cylinder1 {
    public int radius;
    public int height;

    double lidArea() {
        return Math.PI * (radius * 2);
    }

    double TotalSurfaceArea() {
        return lidArea() * 2 + height * lidArea();

    }

}

public class cylinder {
    public static void main(String[] args) {
        cylinder1 c = new cylinder1();
        c.radius = 15;
        c.height = 10;
        System.out.println(c.lidArea());
        System.out.println(c.TotalSurfaceArea());

    }
}
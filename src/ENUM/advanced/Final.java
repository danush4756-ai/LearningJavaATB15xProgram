package ENUM.advanced;
public class Final {
    public static void main() {
        double earthGravity = Planets.EARTH.surfaceGravity();
        System.out.println(earthGravity);
        System.out.println(Planets.valueOf("EARTH").getMass());
        System.out.println(Planets.EARTH.getMass());
    }
}
enum Planets {
    MERCURY(3.303e23, 2.4397e6),
    VENUS(4.869e24, 6.0518e6),
    EARTH(5.976e24, 6.37814e6),
    MARS(6.421e23, 3.3972e6);
    public double getMass() {
        return mass;
    }
    public double getRadius() {
        return radius;
    }
    private final double mass;
    private final double radius;
    Planets(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }
    public double surfaceGravity() {
        final double G = 6.67300E-11;
        return G * mass / (radius * radius);
    }
}
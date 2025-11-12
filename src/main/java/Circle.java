public class Circle extends Figure {
    private double radius;
    private final String name = "Circle";

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println(name + " jest koloru: " + getColor() + " jego radius wynosi: " + radius + "cm. " + "Jego pole wynosi: " + getArea());
    }
}

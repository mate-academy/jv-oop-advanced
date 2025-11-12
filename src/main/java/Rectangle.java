public class Rectangle extends Figure {

    private double sideA;
    private double sideB;
    private final String name = "Rectangle";

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public void draw() {
        System.out.println(name + " jest koloru: " + getColor() + " jego boki wynoszą: " + sideA + "cm. " + sideB + " cm. " + "Jego pole wynosi: " + getArea());
    }
}

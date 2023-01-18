package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double heightSize;
    private double firstBaseSize;
    private double secondBaseSize;

    public IsoscelesTrapezoid(String color, double firstBaseSize, double secondBaseSize,
                              double heightSize) {
        super(color);
        this.firstBaseSize = firstBaseSize;
        this.secondBaseSize = secondBaseSize;
        this.heightSize = heightSize;
    }

    @Override
    public double getArea() {
        return (firstBaseSize + secondBaseSize) / 2 * heightSize;
    }

    @Override
    public String toString() {
        return "Figure: Isosceles Trapezoid, " + "Color: " + this.getColor() + ", First Base Size: "
                + firstBaseSize + ", Second Base Size: " + secondBaseSize + ", Height Size: "
                + heightSize + ", Area: " + this.getArea();
    }
}

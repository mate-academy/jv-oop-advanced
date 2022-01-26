package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double middleLine;
    private double height;

    IsoscelesTrapezoid(String color, double middleLine, double height) {
        super(color);
        this.middleLine = middleLine;
        this.height = height;
    }

    public double getArea() {
        return middleLine * height;
    }

    public String draw() {
        return "\n" + "Isosceles trapezoid - " + getColor()
                + "\n" + "middle line: " + middleLine
                + "\n" + "height: " + height
                + "\n" + "area: " + getArea();
    }
}

package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double height;
    private double middleLine;

    public IsoscelesTrapezoid(double height, double middleLine, Color color) {
        super(color);
        this.height = height;
        this.middleLine = middleLine;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setMiddleLine(double middleLine) {
        this.middleLine = middleLine;
    }

    public double getHeight() {
        return height;
    }

    public double getMiddleLine() {
        return middleLine;
    }

    @Override
    public double getArea() {
        return height * middleLine;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Isosceles trapezoid, area: " + getArea()
                + " sq.units, height: " + height + "units, middle line: "
                + middleLine + " units, color: " + getColor());
    }
}

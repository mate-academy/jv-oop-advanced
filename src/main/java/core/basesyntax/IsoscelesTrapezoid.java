package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int middleLine;

    public IsoscelesTrapezoid(String color, int height, int middleLine) {
        super(color, "isosceles trapezoid");
        this.height = height;
        this.middleLine = middleLine;
    }

    @Override
    public String draw() {
        return super.draw() + ", high: " + this.height + ", avrgLine: " + this.middleLine;
    }

    @Override
    public double calculateArea() {
        return (double) middleLine * height;
    }
}

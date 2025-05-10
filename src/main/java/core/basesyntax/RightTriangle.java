package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLine;
    private double secondLine;

    public RightTriangle(String color, double firstLine, double secondLine) {
        super(color);
        this.firstLine = firstLine;
        this.secondLine = secondLine;
    }

    @Override
    public double getArea() {
        return (firstLine * secondLine) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: "
                + getArea() + " sq.units, firstLine: " + firstLine
                + " units, secondLine: " + secondLine
                + " units, color: " + color);
    }
}

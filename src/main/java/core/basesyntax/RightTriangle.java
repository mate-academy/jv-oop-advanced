package core.basesyntax;

public class RightTriangle extends Figure {
    private double underSide;
    private double lateralSide;

    public RightTriangle(double underSide, double lateralSide, String color) {
        this.underSide = underSide;
        this.lateralSide = lateralSide;
        setColor(color);
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + calculate()
                + "sq. units, underSide: " + underSide
                + " units, lateralSide: " + lateralSide
                + " color: " + getColor());
    }

    @Override
    public double calculate() {
        return 0.5 * underSide * lateralSide;
    }
}

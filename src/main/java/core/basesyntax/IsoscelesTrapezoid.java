package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double underSide;
    private double upperSide;
    private double height;

    public IsoscelesTrapezoid(double underSide, double upperSide, double height, String color) {
        this.underSide = underSide;
        this.upperSide = upperSide;
        this.height = height;
        setColor(color);
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + calculate() + " sq. units, underSide: " + upperSide + " upperSide units, "
                + upperSide + " units, height:" + height + " units, color: " + getColor());
    }

    @Override
    public double calculate() {
        return (underSide + underSide) / 2 * height;
    }
}

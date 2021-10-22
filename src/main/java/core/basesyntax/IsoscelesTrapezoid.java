package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements AreaCalculator {
    private double downSide;
    private double topSide;
    private double height;

    public IsoscelesTrapezoid(String color, double downSide, double topSide, double height) {
        this.color = color;
        this.downSide = downSide;
        this.topSide = topSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (downSide + topSide) / 2 * height;
    }

    @Override
    public String draw() {
        return "Figure: " + this.getClass().getSimpleName()
                + ", area: " + getArea() + " sq.units, downSide: "
                + downSide + " units, topSide: " + topSide + " units, height: "
                + height + " units, color: " + color;
    }
}

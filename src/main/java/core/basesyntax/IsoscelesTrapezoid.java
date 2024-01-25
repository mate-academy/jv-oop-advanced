package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double firstSide;
    private final double secondSide;
    private final double height;

    public IsoscelesTrapezoid(String color, double firstSide, double secondSide, double height) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
    }

    public void drawFigure() {
        System.out.println("Figure: IsoscelesTrapezoid" + ", area: " + getArea() + " sq.units, "
                + "firstSide: " + firstSide + ", secondSide: " + secondSide + ", hight: "
                + height + ", color: " + color);
    }

    @Override
    public double getArea() {
        return (firstSide + secondSide) / 2 * height;
    }

}

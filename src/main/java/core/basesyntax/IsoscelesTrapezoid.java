package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int bottomSide;
    private int upperSide;
    private int height;

    public IsoscelesTrapezoid(String color, int bottomSide, int upperSide, int height) {
        this.color = color;
        this.bottomSide = bottomSide;
        this.upperSide = upperSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (bottomSide + upperSide) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: trapezoid, area: " + getArea() + " sq.units, "
                + "bottomSide: " + bottomSide + " units, upperSide: "
                + upperSide + " " + "units, height: " + height + " units, color: "
                + color);
    }
}

package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private static final double FORMULA_NUMBER = 2;
    private final int height;
    private final int upperSide;
    private final int downSide;

    public IsoscelesTrapezoid(String color, int height, int upperSide, int downSide) {
        super(color);
        this.height = height;
        this.upperSide = upperSide;
        this.downSide = downSide;
    }

    @Override
    public double findArea() {
        return ((upperSide + downSide) / FORMULA_NUMBER) * height;
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: isosceles trapezoid, area: " + findArea()
                + " sq.units, height: " + height + " units, upperSide: " + upperSide
                + " units, downSide: " + downSide + " units, color: " + getColor());
    }
}

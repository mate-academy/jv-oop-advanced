package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private static final double FORMULA_NUMBER = 2;
    private int high;
    private int upperSide;
    private int downSide;

    public IsoscelesTrapezoid(String color, int high, int upperSide, int downSide) {
        super(color);
        this.high = high;
        this.upperSide = upperSide;
        this.downSide = downSide;
    }

    @Override
    public double findArea() {
        return ((this.upperSide + this.downSide) / FORMULA_NUMBER) * high;
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: isosceles trapezoid, area: " + this.findArea()
                + " sq.units, high: " + this.high + " units, upperSide: " + this.upperSide
                + " units, downSide: " + this.downSide + " units, color: " + this.getColor());
    }
}

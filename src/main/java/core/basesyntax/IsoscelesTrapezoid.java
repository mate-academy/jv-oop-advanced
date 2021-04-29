package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int upBase;
    private int downBase;
    private int trapezoidHeight;

    public IsoscelesTrapezoid(Color color, int upBase, int downBase, int trapezoidHeight) {
        super(color);
        this.upBase = upBase;
        this.downBase = downBase;
        this.trapezoidHeight = trapezoidHeight;
    }

    public void setUpBase(int upBase) {
        this.upBase = upBase;
    }

    public void setDownBase(int downBase) {
        this.downBase = downBase;
    }

    public void setTrapezoidHeight(int trapezoidHeight) {
        this.trapezoidHeight = trapezoidHeight;
    }

    @Override
    public double getArea() {
        return (upBase * downBase) / 2 * trapezoidHeight;
    }

    @Override
    public void draw() {
        System.out.println("Figure: trapezoid, area: " + getArea() + " sq. units, base: " + downBase
                + " units, color: " + getColor());
    }
}

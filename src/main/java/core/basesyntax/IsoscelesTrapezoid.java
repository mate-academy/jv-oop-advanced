package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstBase;
    private int secondBase;
    private int heigh;

    public IsoscelesTrapezoid(int firstBase, int secondBase, int heigh, Color color) {
        super(color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.heigh = heigh;
    }

    @Override
    public double getArea() {
        return ((firstBase + secondBase) * heigh) / 2.0;
    }

    @Override
    public String getFigureInfo() {
        return "Figure: IsoscelesTrapezoid, area: " + getArea() + " sq. units, firstBase: "
                + firstBase + " secondBase "
                + secondBase + " heigh " + heigh + " units, color: " + getColor();
    }
    /* Wzór na pole trapezu równoramiennego (a+b)*h /2 */
}

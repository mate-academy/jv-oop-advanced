package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstBase;
    private int secondBase;
    private int heigh;

    public IsoscelesTrapezoid(int firstBase, int secondBase, int heigh) {
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.heigh = heigh;
    }

    public IsoscelesTrapezoid(int firstBase, int secondBase, int heigh, Color color) {
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.heigh = heigh;
        super.color = color;
    }

    @Override
    public double getArea() {
        return (firstBase * secondBase) * heigh / 2;
    }

    @Override
    public String getFigureInfo() {
        return "Figure: IsoscelesTrapezoid, area: " + getArea() + " sq. units, firstBase: "
                + firstBase + " secondBase "
                + secondBase + " heigh " + heigh + " units, color: " + super.color;
    }
    /* Wzór na pole trapezu równoramiennego (a+b)*h /2 */
}

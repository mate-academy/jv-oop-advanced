package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstBase;
    private double secondBase;
    private double height;

    public IsoscelesTrapezoid(Color color, double firstBase, double secondBase, double height) {
        super(color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    @Override
    public double getArray() {
        return (firstBase + secondBase) * height / 2;
    }

    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, area: "
                + getArray() + " sq. units, firstBase: "
                + firstBase + " units, secondBase: " + secondBase
                + " units, height:" + height + " units, color: " + getColor());
    }
}

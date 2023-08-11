package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double firstBase;
    private final double secondBase;
    private final double leg;
    private final double height;

    public IsoscelesTrapezoid(String color, double firstBase,
                              double secondBase, double leg, double height) {
        super(color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.leg = leg;
        this.height = height;
    }

    @Override
    public double getArea() {
        return height / 2 * (firstBase + secondBase) * leg;
    }

    @Override
    public boolean getDrawing() {
        System.out.println("Figure : " + this.getClass().getSimpleName().toLowerCase()
                + ", area: " + String.format("%.2f", getArea())
                + " sq.units, first Base: " + firstBase + " second base: "
                + secondBase + " units, leg: " + leg + " height: "
                + height + " color: " + getColor());
        return false;
    }
}

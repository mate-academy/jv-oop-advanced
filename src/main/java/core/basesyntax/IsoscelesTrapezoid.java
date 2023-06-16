package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int firstBase;
    private int secondBase;

    public IsoscelesTrapezoid(String color, int height, int firstBase, int secondBase) {
        super(color);
        this.height = height;
        this.firstBase = firstBase;
        this.secondBase = secondBase;
    }

    public IsoscelesTrapezoid() {

    }

    @Override
    public double calculateArea() {
        return ((firstBase + secondBase) / 2) * height;
    }

    @Override
    public String draw() {
        return "Figure: " + Figures.ISOSCELES_TRAPEZOID.name() + ", area: "
                + calculateArea() + " sq.units, "
                + "height: " + height + " units, "
                + "first base: " + firstBase + " units, "
                + "second base: " + secondBase + " units, "
                + "color: " + getColor();
    }
}

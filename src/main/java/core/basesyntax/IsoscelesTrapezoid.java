package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstBase;
    private double secondBase;
    private double height;

    public IsoscelesTrapezoid(String color, double firstBase, double secondBase, double height) {
        super(color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    public double getFirstBase() {
        return firstBase;
    }

    public double getSecondBase() {
        return secondBase;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return ((firstBase + secondBase) * height) / 2;
    }

    @Override
    public String draw() {
        return "Figure: IsoscelesTrapezoid, area: "
                + getArea() + " sq. units, firstBase: "
                + getFirstBase() + " units, secondBase: "
                + getSecondBase() + " units,height: "
                + getHeight() + " units, color: " + getColor();
    }
}

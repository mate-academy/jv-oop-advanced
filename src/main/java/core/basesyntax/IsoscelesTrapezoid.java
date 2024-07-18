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
        return (firstBase + secondBase) * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, area: "
                + String.format("%.2f", getArea()) + " sq. units, firstBase: "
                + String.format("%.2f", getFirstBase()) + " units, secondBase: "
                + String.format("%.2f", getSecondBase()) + " units,height: "
                + String.format("%.2f", getHeight()) + " units, color: " + getColor());
    }
}

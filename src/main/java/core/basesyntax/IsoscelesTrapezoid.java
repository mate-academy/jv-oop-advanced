package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements Shape {
    private final double firstBase;
    private final double secondBase;
    private final double height;

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
        return (firstBase + secondBase) / 2 * height;
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: trapezoid, area: " + getArea() + " sq.units, firstBase: "
                + getFirstBase() + " units, secondBase: " + getSecondBase() + " units, height: "
                + getHeight() + " units, color: " + getColor());
    }
}

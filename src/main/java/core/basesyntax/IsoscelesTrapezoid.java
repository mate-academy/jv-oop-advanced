package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double firstBase;
    private final double secondBase;
    private final double height;

    public IsoscelesTrapezoid(String color, double baseA, double baseB, double height) {
        super(color, FigureType.TRAPEZOID);
        this.firstBase = baseA;
        this.secondBase = baseB;
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
        System.out.println("Figure: " + getTypeName()
                + ", area: " + String.format("%.2f", getArea())
                + " sq.units, firstBase: " + getFirstBase() + " units, secondBase: "
                + getSecondBase() + " units, height: " + getHeight() + " units, color: "
                + getColor());
    }
}

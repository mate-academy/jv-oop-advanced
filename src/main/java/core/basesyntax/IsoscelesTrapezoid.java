package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstBase;
    private int secondBase;
    private int height;

    public IsoscelesTrapezoid(String color, int firstBase, int secondBase, int height) {
        super(color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    public int getFirstBase() {
        return firstBase;
    }

    public int getSecondBase() {
        return secondBase;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return (firstBase + secondBase) / 2.0 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: trapezoid, area: " + getArea() + " sq.units, "
                + "firstBase: " + getFirstBase() + " secondBase: " + getSecondBase()
                + " height: " + getHeight() + " units, color: " + getColor());
    }
}

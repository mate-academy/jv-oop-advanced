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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getFirstBase() {
        return firstBase;
    }

    public void setFirstBase(int firstBase) {
        this.firstBase = firstBase;
    }

    public int getSecondBase() {
        return secondBase;
    }

    public void setSecondBase(int secondBase) {
        this.secondBase = secondBase;
    }

    @Override
    public double getArea() {
        return (firstBase + secondBase) * height / 2.0;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: isosceles trapezoid, "
                + "area: %.2f sq.units, "
                + "height: %d units, "
                + "base 1: %d units, "
                + "base 2: %d units, "
                + "color: %s"
                + System.lineSeparator(), getArea(), height, firstBase, secondBase, getColor());
    }
}

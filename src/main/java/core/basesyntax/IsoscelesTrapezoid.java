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

    @Override
    public double getArea() {
        return 0.5 * (firstBase + secondBase) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, first base: " + getFirstBase() + ", second base: "
                + getSecondBase() + " height: " + getHeight() + ", color: " + getColor());
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
}

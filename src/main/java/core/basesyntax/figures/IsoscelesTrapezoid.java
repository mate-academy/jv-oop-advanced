package core.basesyntax.figures;

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

    public void setFirstBase(int firstBase) {
        this.firstBase = firstBase;
    }

    public int getSecondBase() {
        return secondBase;
    }

    public void setSecondBase(int secondBase) {
        this.secondBase = secondBase;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((firstBase + secondBase) / 0.5) * height;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: trapezoid, area: " + getArea()
                        + " sq.units, first base: " + getFirstBase()
                        + " units, second base: " + getSecondBase()
                        + " units, height: " + getHeight()
                        + " units, color: " + getColor());
    }
}

package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    private final int firstBase;
    private final int secondBase;
    private final int height;

    public IsoscelesTrapezoid(String color, int firstBase, int secondBase, int height) {
        super(color);
        this.height = height;
        this.firstBase = firstBase;
        this.secondBase = secondBase;
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
    public double calculateArea() {
        int sumOfBase = firstBase + secondBase;
        return (sumOfBase / 2) * 2;
    }

    @Override
    public String drawFigure() {
        return "Figure: isosceles trapezoid, area: " + calculateArea()
                + " sq.units, first base: " + getFirstBase()
                + " units, second base: " + getSecondBase()
                + " units, height: " + getHeight()
                + " units, color: " + getColor();
    }
}

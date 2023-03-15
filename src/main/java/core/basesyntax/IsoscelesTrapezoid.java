package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final String color;
    private final int firstBase;
    private final int secondBase;
    private final int height;

    public IsoscelesTrapezoid(String color, int firstBase, int secondBase, int height) {
        this.color = color;
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return (double) (firstBase + secondBase) / 2 * height;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, firstBase: " + firstBase + " units, secondBase: "
                + secondBase + " units, height: " + height + " units, color: " + getColor());
    }
}

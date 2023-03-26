package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int side;
    private final int firstBase;
    private final int secondBase;

    public IsoscelesTrapezoid(int side, int firstBase, int secondBase, String color) {
        this.side = side;
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + String.format("%.2f", getArea())
                + ", side: " + side + ", first Base: " + firstBase + ", secondBase: " +
                secondBase + ", color: " + color);
    }

    @Override
    public double getArea() {
        return (double) (firstBase + secondBase) / 4 * Math.sqrt(4 * Math.pow(side, 2) - Math.pow(firstBase - secondBase, 2));
    }
}

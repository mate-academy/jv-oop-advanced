package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int firstBase;
    private final int secondBase;
    private final int height;

    public IsoscelesTrapezoid(Color color, int firstBase, int shorterBase, int height) {
        super(color);
        this.firstBase = firstBase;
        this.secondBase = shorterBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (firstBase + secondBase) * height * 0.5;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, longerBase: " + firstBase + " units, shorterBase: " + secondBase
                + " units, height: " + height + " units, color: " + color + ".");
    }
}

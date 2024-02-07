package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int smallerBase;
    private int biggerBase;
    private int height;

    public IsoscelesTrapezoid(int smallerBase, int biggerBase, int height, String color) {
        this.smallerBase = smallerBase;
        this.biggerBase = biggerBase;
        this.height = height;
        setColor(color);
    }

    @Override
    public double getArea() {
        return smallerBase * biggerBase / 2.00 * height;
    }

    @Override
    public String draw() {
        return String.format(Pen.TEMPLATE,
                FigureName.ISOSCELES_TRAPEZOID.name().toLowerCase(),
                getArea(),
                String.format("smallerBase: %d units, biggerBase: %d units, height: %d units",
                        smallerBase, biggerBase, height), getColor());
    }
}

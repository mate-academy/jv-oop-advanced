package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    private final int lowSide;
    private final int bigSide;
    private final int height;

    public IsoscelesTrapezoid(Color color, int lowSide, int bigSide, int height) {
        super(color);
        this.lowSide = lowSide;
        this.bigSide = bigSide;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (lowSide + bigSide) / 2.0 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Isosceles Trapezoid, area: " + calculateArea()
                + " units, lowSide " + lowSide + " units, bigSide " + bigSide + " units, height "
                + height + " units, color: " + getColor());
    }
}

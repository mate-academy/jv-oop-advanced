package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    private final int lowSide;
    private final int bigSide;
    private final int height;

    public IsoscelesTrapezoid(String color, int lowSide, int bigSide, int height) {
        super.setColor(color);
        this.lowSide = lowSide;
        this.bigSide = bigSide;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (double) (lowSide + bigSide) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Isosceles Trapezoid, area: " + calculateArea()
                + " units, lowSide " + lowSide + " units, bigSide " + bigSide + " units, height "
                + height + " units, color: " + getColor());
    }
}

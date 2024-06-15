package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int longSide;
    private int shortSide;
    private int height;

    public IsoscelesTrapezoid(int longSide, int shortSide, int height, String color) {
        super(color);
        this.longSide = longSide;
        this.shortSide = shortSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (double) (longSide + shortSide) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + getArea()
                + " sq. units, long side: "
                + longSide
                + " units, short side: "
                + shortSide
                + " units, height: "
                + height
                + " units, color: "
                + getColor());
    }
}

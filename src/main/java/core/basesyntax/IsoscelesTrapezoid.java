package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double longSide;
    private double shortSide;
    private double height;

    public IsoscelesTrapezoid(String color, double longSide, double shortSide, double height) {
        super(color);
        this.longSide = longSide;
        this.shortSide = shortSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (shortSide + longSide) * height / 2;
    }

    @Override
    public void draw() {
        String trapezoidInfo = "Figure: "
                + this.getClass().getSimpleName()
                + ", area: "
                + getArea()
                + " sq.units, long side: "
                + longSide
                + " units, short side: "
                + shortSide
                + " units, height: "
                + height
                + " units, color: "
                + getColor();
        System.out.println(trapezoidInfo);
    }
}

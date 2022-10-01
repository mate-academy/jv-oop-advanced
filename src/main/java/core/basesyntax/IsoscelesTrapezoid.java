package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double topSide;
    private final double bottomSide;
    private final double height;

    public IsoscelesTrapezoid(String color, double topSide, double bottomSide, double height) {
        super(color);
        this.topSide = topSide;
        this.bottomSide = bottomSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((topSide + bottomSide) * height) / 2;
    }

    @Override
    public void draw() {
        String s = "Figure: isoscelesTrapezoid, area: ";
        System.out.println(s + getArea() + " sq.units, top side: "
                + topSide + " units, bottom side: " + bottomSide
                + " units, height " + height + " units, color: " + getColor());
    }
}

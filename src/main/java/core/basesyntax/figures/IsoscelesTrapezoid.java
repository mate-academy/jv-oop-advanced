package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    private double topSide;
    private double bottomSide;
    private double height;

    public IsoscelesTrapezoid(double topSide, double bottomSide, double height, String color) {
        super(color);
        this.topSide = topSide;
        this.bottomSide = bottomSide;
        this.height = height;

    }

    @Override
    public double calculateArea() {
        return ((topSide + bottomSide) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + getStringFormat(calculateArea())
                + " sq. units, Top side: " + getStringFormat(topSide) + " units, "
                + "Bottom side: " + getStringFormat(bottomSide) + " units, "
                + "Height: " + getStringFormat(height) + " units, "
                + "color: " + getColor());
    }
}

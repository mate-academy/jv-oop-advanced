package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double height;
    private double topSide;
    private double downSide;

    public IsoscelesTrapezoid(double height, double topSide, double downSide,Color color) {
        super(color);
        this.height = height;
        this.topSide = topSide;
        this.downSide = downSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Isosceles trapezoid\n"
                + "area: " + findArea() + "sq.units\n"
                + "height: " + height + "units\n"
                + "top side: " + topSide + "units\n"
                + "down side: " + downSide + "units\n"
                + "color: " + getColor());
    }

    @Override
    public double findArea() {
        return (topSide + downSide) / 2 * height;
    }
}

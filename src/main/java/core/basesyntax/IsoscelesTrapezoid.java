package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double topSide;
    private double downSide;
    private double height;

    public IsoscelesTrapezoid(String color,
            double topSide, double downSide, double height) {
        super(color);
        this.topSide = topSide;
        this.downSide = downSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (topSide + downSide) / 2 * height;
    }

    @Override
    public String name() {
        return String.valueOf(Figures.ISOSCELES_TRAPEZOID);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + name()
                + ", area: " + getArea()
                + ", topSide: " + topSide
                + ", downSide: " + downSide
                + ", height: " + height
                + ", color: " + getColor());
    }
}

package core.basesyntax.models;

public class IsoscelesTrapezoid extends Figure {
    private double topSide;
    private double bottomSide;
    private double height;

    public IsoscelesTrapezoid(String color, double topSide, double bottomSide, double height) {
        super(color);
        this.topSide = topSide;
        this.bottomSide = bottomSide;
        this.height = height;
    }

    public double getTopSide() {
        return topSide;
    }

    protected void setTopSide(double topSide) {
        this.topSide = topSide;
    }

    public double getBottomSide() {
        return bottomSide;
    }

    protected void setBottomSide(double bottomSide) {
        this.bottomSide = bottomSide;
    }

    public double getHeight() {
        return height;
    }

    protected void setHeight(double height) {
        this.height = height;
    }

    protected void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %.2f sq.units, topSide: %.2f units, "
                        + "bottomSide: %.2f units, height: %.2f units, color: %s%n",
                getClass().getSimpleName(),
                getArea(),
                topSide,
                bottomSide,
                height,
                color.toLowerCase()
        );
    }

    @Override
    public double getArea() {
        return ((bottomSide + topSide) / 2) * height;
    }
}

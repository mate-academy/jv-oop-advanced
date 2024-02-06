package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double height;
    private double bottomSide;
    private double topSide;

    public IsoscelesTrapezoid(String color, double height, double bottomSide, double topSide) {
        super(color);
        this.height = height;
        this.bottomSide = bottomSide;
        this.topSide = topSide;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBottomSide() {
        return bottomSide;
    }

    public void setBottomSide(double bottomSide) {
        this.bottomSide = bottomSide;
    }

    public double getTopSide() {
        return topSide;
    }

    public void setTopSide(double topSide) {
        this.topSide = topSide;
    }

    @Override
    public double getArea() {
        return height * ((bottomSide + topSide) * 0.5);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName()
                + ", area: " + getArea()
                + " sq.units, color: " + getColor()
                + ", height: " + getHeight()
                + ", bottomSide: " + getBottomSide() + ", topSide: " + getTopSide());
    }
}

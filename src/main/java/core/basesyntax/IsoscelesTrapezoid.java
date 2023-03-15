package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double topSide;
    private double bottomSide;
    private double height;

    public IsoscelesTrapezoid(Color color, double topSide, double bottomSide, double height) {
        super(color);
        this.topSide = topSide;
        this.bottomSide = bottomSide;
        this.height = height;
    }

    public double getTopSide() {
        return topSide;
    }

    public void setTopSide(double topSide) {
        this.topSide = topSide;
    }

    public double getBottomSide() {
        return bottomSide;
    }

    public void setBottomSide(double bottomSide) {
        this.bottomSide = bottomSide;
    }

    public double calculateArea() {
        return (topSide + bottomSide) / 2 * height;
    }

    @Override
    public void drawFigure() {
        System.out.println("Isosceles Trapezoid with colour " + getColor()
                + " top side length = " + topSide + " bottom side length "
                + bottomSide + " height " + height + " area " + calculateArea());
    }
}

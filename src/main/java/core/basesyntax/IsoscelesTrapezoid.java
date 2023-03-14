package core.basesyntax;

public class IsoscelesTrapezoid extends Figure{
    private double topSide;
    private double bottomSide;
    private double height;

    public IsoscelesTrapezoid(COLOR colour, double topSide, double bottomSide, double height) {
        super(colour);
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

    @Override
    public void getArea() {
        System.out.println("Isosceles Trapezoid with colour " + getColor() + " top side length = " + topSide + " bottom side length " + bottomSide + " height " + height);
    }
}

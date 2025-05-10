package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double equalsSide;
    private double topSide;
    private double bottomSide;

    public IsoscelesTrapezoid(String color, double equalsSide, double topSide, double bottomSide) {
        super(color);
        this.equalsSide = equalsSide;
        this.bottomSide = bottomSide;
        this.topSide = topSide;
    }

    public double getEqualsSide() {
        return equalsSide;
    }

    public void setEqualsSide(double equalsSide) {
        this.equalsSide = equalsSide;
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
    public double getArea() {
        return (topSide + bottomSide) / 2 * Math.sqrt(Math.pow(equalsSide, 2)
                - (Math.pow(bottomSide - topSide, 2) / 4));
    }

    @Override
    public void draw() {
        System.out.println("Figure is Isosceles Trapezoid"
                + ", Color is " + getColor()
                + ", EqualsSide = " + equalsSide
                + ", TopSide = " + topSide
                + ", BottomSide = " + bottomSide
                + ", Area = " + getArea());
    }
}

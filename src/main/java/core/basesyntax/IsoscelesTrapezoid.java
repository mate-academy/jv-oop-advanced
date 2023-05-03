package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double upperSide;
    private double bottomSide;
    private double side;

    public IsoscelesTrapezoid(String color, double upperSide, double bottomSide, double side) {
        super(color);
        this.upperSide = bottomSide;
        this.bottomSide = bottomSide;
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getUpperSide() {
        return upperSide;
    }

    public void setUpperSide(double upperSide) {
        this.upperSide = upperSide;
    }

    public double getBottomSide() {
        return bottomSide;
    }

    public void setBottomSide(double bottomSide) {
        this.bottomSide = bottomSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Isosceles trapezoid\nColor: " + getColor()
                + "\nArea: " + getArea() + "\nUpper side: " + upperSide
                + "\nBottom side: " + bottomSide + "\n Side faces: " + side);
    }

    @Override
    public double getArea() {

        double oneLeg = (bottomSide - upperSide) / 2;
        double height = Math.sqrt(Math.pow(side, 2) - Math.pow(oneLeg, 2));
        return ((bottomSide + upperSide) / 2) * height;

    }
}

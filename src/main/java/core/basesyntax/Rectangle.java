package core.basesyntax;

public class Rectangle extends Figure {
    private double topSide;
    private double side;

    public Rectangle(String color, double topSide, double side) {
        super(color);
        this.topSide = topSide;
        this.side = side;
    }

    public double getTopSide() {
        return topSide;
    }

    public void setTopSide(double topSide) {
        this.topSide = topSide;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return topSide * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure is Rectangle"
                + ",Color is " + getColor()
                + ", Top Side = " + topSide
                + ", Side = " + side
                + ", Area = " + getArea());
    }
}

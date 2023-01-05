package core.basesyntax;

public class RightTriangle extends Figure {
    private double SideOne;
    private double SideTwo;

    public RightTriangle(double SideOne, double SideTwo, String color) {
        super(color);
        this.SideOne = SideOne;
        this.SideTwo = SideTwo;
    }

    @Override
    public double getArea() {
        return (SideOne * SideTwo) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure:RightTriangle "
                + "Color:" + getColor()
                + " " + "Area: " + getArea());
    }
}

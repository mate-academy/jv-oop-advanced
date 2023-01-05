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

    public void setSideOne(double sideOne) {
        SideOne = sideOne;
    }

    public void setSideTwo(double sideTwo) {
        SideTwo = sideTwo;
    }

    public double getSideTwo() {
        return SideTwo;
    }

    public double getSideOne() {
        return SideOne;
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }
}

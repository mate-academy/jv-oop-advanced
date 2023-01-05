package core.basesyntax;

public class RightTriangle extends Figure {
    private double sideone;
    private double sidetwo;

    public RightTriangle(double sideone, double sidetwo, String color) {
        super(color);
        this.sideone = sideone;
        this.sidetwo = sidetwo;
    }

    @Override
    public double getArea() {
        return (sideone * sidetwo) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure:RightTriangle "
                + "Color:" + getColor()
                + " " + "Area: " + getArea());
    }

    public void setSideOne(double sideOne) {
        sideone = sideOne;
    }

    public void setSideTwo(double sideTwo) {
        sidetwo = sideTwo;
    }

    public double getSideTwo() {
        return sidetwo;
    }

    public double getSideOne() {
        return sideone;
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

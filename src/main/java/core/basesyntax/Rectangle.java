package core.basesyntax;

public class Rectangle extends Figure {
    private double sideone;
    private double sidetwo;

    public Rectangle(double sideone, double sidetwo, String color) {
        super(color);
        this.sideone = sideone;
        this.sidetwo = sidetwo;
    }

    @Override
    public double getArea() {
        return sideone * sidetwo;
    }

    @Override
    public void draw() {
        System.out.println("Figure:Rectangle " + "Color:"
                + getColor() + " " + "Area: " + getArea());
    }

    public void setSideOne(double sideOne) {
        sideone = sideOne;
    }

    public void setSideTwo(double sideTwo) {
        sidetwo = sideTwo;
    }

    public double getSideOne() {
        return sideone;
    }

    public double getSideTwo() {
        return sidetwo;
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

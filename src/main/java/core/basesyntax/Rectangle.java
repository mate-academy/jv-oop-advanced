package core.basesyntax;

public class Rectangle extends Figure {
    private double SideOne;
    private double SideTwo;

    public Rectangle(double SideOne, double SideTwo, String color) {
        super(color);
        this.SideOne = SideOne;
        this.SideTwo = SideTwo;
    }

    @Override
    public double getArea() {
        return SideOne * SideTwo;
    }

    @Override
    public void draw() {
        System.out.println("Figure:Rectangle " + "Color:"
                + getColor() + " " + "Area: " + getArea());
    }
}

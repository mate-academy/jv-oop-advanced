package core.basesyntax;

public class Rectangle extends Figure {
    private double sideRectangle1;
    private double sideRectangle2;

    public Rectangle(double firstSide, double secondSide,
                     Color color) {
        super(color);
        this.sideRectangle1 = firstSide;
        this.sideRectangle2 = secondSide;
    }

    @Override
    public double getArea() {
        return sideRectangle1 * sideRectangle2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea()
                + " sq. units, first side " + sideRectangle1 + ", second side: "
                + sideRectangle2 + " units, color: " + color.name());
    }
}

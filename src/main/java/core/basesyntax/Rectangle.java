package core.basesyntax;

public class Rectangle extends Figure implements AreaCalculator {
    private double width;

    public Rectangle(String color, double parameter, double width) {
        super(color, parameter);
        this.width = width;
    }

    @Override
    public double getArea() {
        return getParameter() * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle " + getArea()
                + " sq.units, length: " + getParameter()
                + " units, width: " + width
                + " units, color: " + getColor());
    }
}

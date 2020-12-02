package core.basesyntax;

public class Circle extends Figure {
    private int radius;
    private int diameter;

    public Circle(Colour colour, int radius) {
        super(colour);
        this.radius = radius;
        this.perimeter = 2 * radius * Math.PI;
        this.diameter = 2 * radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + calculateArea() + " sq.units, radius: "
                + getRadius() + ", perimeter: " + getPerimeter() + ", diameter: " + diameter
                + ", colour: " + getColour());
    }

    @Override
    public double calculateArea() {
        return 2 * Math.PI * radius * radius;
    }
}

package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, Colour colour) {
        super(colour);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String draw() {
        return "Circle:" +
                " colour: " + getColour()+
                " radius: " + parsingValue(radius) +
                " perimeter" + parsingValue(getPerimeter()) +
                " area: " + parsingValue(getArea());

    }
}

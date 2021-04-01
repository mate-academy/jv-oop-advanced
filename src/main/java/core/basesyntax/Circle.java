package core.basesyntax;

public class Circle extends Figure implements AreaCalculator {
    private int radius;

    public Circle(String type, String colour, String property, int radius) {
        super(type, colour, property);
        this.radius = radius;
    }

    @Override
    public void setType(String type) {
        super.setType("circle");
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + getType() + ", " + calculateArea() + " sq. units, radius: "
                + radius + " units, color: " + getColour() + ", property: " + getProperty());
    }
}

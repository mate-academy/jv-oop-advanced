package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(double newRadius, String newColor) {
        setName("circle");
        setSymbol("●");
        radius = newRadius;
        super.setColor(newColor);
        calculateArea();
        calculateBorderline();
    }

    public double getDiameter() {
        return radius * 2;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void calculateArea() {
        double math = Math.PI * radius * radius;
        setArea(math);
    }

    @Override
    public void calculateBorderline() {
        setBorderLength(2 * Math.PI * radius);
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + getSymbol() + " - " + getName()
                        + " (area: " + getArea() + " sq units;"
                        + " border length (circumference): " + getBorderLength() + " units;"
                        + " diameter length: " + getDiameter() + " units;"
                        + " color " + getColor() + ")");
    }
}

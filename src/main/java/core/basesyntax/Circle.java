package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    Circle(String color) {
        super(color);
    }

    Circle(String color, double radius) {
        super(color);
        this.setName("Circle");
        this.radius = radius;
        this.setArea(calculateArea());
    }

    @Override
    void drawFigure() {
        String text = "Figure: " + getName() + ", area: " + getArea()
                + " sq.units, radius: " + getRadius()
                + " units, color: " + getColor();
        System.out.println(text);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

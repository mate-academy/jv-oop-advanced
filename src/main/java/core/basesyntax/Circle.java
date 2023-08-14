package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, String color) {
        this.radius = radius;
        super.color = color;
    }

    public Circle() {

    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: Circle, Area: " + this.getArea() + " radius: "
                + this.radius + " color:" + super.color);
    }
}

package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + FigureName.Circle
                + ", color: " + this.getColor()
                + ", area: " + this.getArea() + " sq. units"
                + ", radius: " + radius + " units");
    }
}

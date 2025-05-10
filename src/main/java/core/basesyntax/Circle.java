package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    {
        setFigureName("Circle");
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getFigureName() + ", area: " + String.valueOf(getArea())
                + " sq.units, radius: " + String.valueOf(radius) + " units, color: " + getColor());
    }
}

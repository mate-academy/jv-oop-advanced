package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(double radius, String color, String typeOfFigure) {
        super(color, typeOfFigure);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getTypeOfFigure() + ", area: " + getArea()
                + " sq. units, radius: " + getRadius() + "  units, color: " + getColor());
    }
}

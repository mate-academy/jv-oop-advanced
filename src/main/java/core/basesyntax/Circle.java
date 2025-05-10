package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(Color color, TypeOfFigure typeOfFigure, double radius) {
        super(color, typeOfFigure);
        this.radius = radius;
    }

    public TypeOfFigure getType() {
        return getTypeOfFigure();
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getType()
                + ", area: " + calculateArea()
                + " sq.units, radius: " + radius
                + " units, color: " + getColor());
    }
}

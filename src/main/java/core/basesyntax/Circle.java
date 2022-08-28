package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        setFigureType(FigureTypeName.circle.toString());
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String draw() {
        return "Drowing a " + getFigureType();
    }

    @Override
    public String toString() {
        return "Figure: " + getFigureType() + ", area: " + getArea()
                + " sq.units, radius: " + radius + " units, color: " + getColor();
    }
}

package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String color) {
        this.radius = radius;
        setFigureType("circle");
        setColor(color);
        calculateArea();
    }

    @Override
    public void calculateArea() {
        setArea(Math.round(Math.PI * Math.pow(radius, 2)));
    }

    @Override
    public String toString() {
        return super.toString()
                + getFigureType()
                + ", area: "
                + getArea()
                + " sq.units"
                + ", radius: "
                + radius
                + " units, color: "
                + getColor();
    }
}

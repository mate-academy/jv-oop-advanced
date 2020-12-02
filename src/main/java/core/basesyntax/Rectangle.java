package core.basesyntax;

public class Rectangle extends Figure {
    private int side1;
    private int side2;

    public Rectangle(Color color, int side1, int side2) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double findAreaFigure() {
        return side1 * side2;
    }

    public int findPerimeter() {
        return (side1 + side2) * 2;
    }

    @Override
    public String draw() {
        return "Figure: rectangle, area: " + findAreaFigure() + " sq. units, perimeter: "
                + findPerimeter() + " units, color: " + getColor();
    }
}


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
    public double areaFigure() {
        return side1 * side2;
    }

    public int perimeter() {
        return (side1 + side2) * 2;
    }

    @Override
    public String drawn() {
        return "Figure: rectangle, area: " + areaFigure() + " sq. units, perimeter: "
                + perimeter() + " units, color: " + getColor();
    }
}

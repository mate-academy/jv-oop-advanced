package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(String color, double side) {
        super(color);
        setFigureType("square");
        this.side = side;
        setArea(calculateArea());
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getFigureType() + ", area: " + getArea()
                + " sq.units, side: " + side + ", color: " + getColor());
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}

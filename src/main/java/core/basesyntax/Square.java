package core.basesyntax;

public class Square extends Figure.Figure {
    private double side;

    public Square(String color, double side) {
        setColor(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea()
                + " sq. units, width: " + side
                + " units, length: " + side
                + " units, color: " + getColor());
    }
}

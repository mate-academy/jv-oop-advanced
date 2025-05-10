package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(String color,double side) {
        setColor(color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + calculateArea()
                + " sq.units, firstSide: " + side
                + " units, color: " + getColor());
    }
}

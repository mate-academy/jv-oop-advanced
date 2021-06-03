package core.basesyntax;

public class Square extends Figure {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
        calculateArea();
    }

    public Square(String color, double side) {
        setColor(color);
        this.side = side;
        calculateArea();
    }

    @Override
    public double calculateArea() {
        return  side * side;

    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + calculateArea()
                + " sq.units, firstSide: " + side
                + " units, color: " + getColor());
    }
}

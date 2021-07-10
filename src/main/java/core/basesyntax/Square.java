package core.basesyntax;

public class Square extends Figure implements AreaCalculator, InfoBox{
    private double side;

    // CONSTRUCTORS
    public Square(double side) {
        this.side = side;
    }

    // GETTERS & SETTERS
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    // BODY
    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Square, area: " + getArea() + " sq.units, side: " + side + " units, color: " + getColor());
    }
}

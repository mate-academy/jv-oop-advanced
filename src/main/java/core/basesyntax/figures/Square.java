package core.basesyntax.figures;

public class Square extends Figure {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {

    }

    @Override
    public double getArea() {
        return side * side;
    }
}

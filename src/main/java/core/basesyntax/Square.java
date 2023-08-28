package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("" + getColor() + " square with area of " + getArea()
                + " sq.units and side of " + side + " units");
    }

    @Override
    public double getArea() {
        return side * side;
    }
}

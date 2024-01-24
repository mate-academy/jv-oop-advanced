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
        System.out.println("Square with side of " + side + " and " + getColor() + " color");

    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }
}

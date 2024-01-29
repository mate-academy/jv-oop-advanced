package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(double side, MyColor color) {
        super(color.name());
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, side: " + side + " units, color: " + getColor());
    }
}

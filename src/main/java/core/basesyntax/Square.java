package core.basesyntax;

public class Square extends FigCol {
    private double side;

    public Square(double side, Color color) {
        super(color);
        this.side = side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: "
                + getArea() + " sq. units, side: " + side + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return side * side;
    }
}

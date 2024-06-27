package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square() {
    }

    public Square(double side, String color) {
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
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: "
                + String.format("%.2f", getArea())
                + ", side: "
                + side
                + ", color: "
                + getColor());
    }
}

package core.basesyntax;

public class Square extends Figures {
    private double side;

    public Square(double side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + area() + " sq.units, side: "
                + side + " units, color: " + getColor());
    }

    @Override
    public double area() {
        return side * side;
    }
}

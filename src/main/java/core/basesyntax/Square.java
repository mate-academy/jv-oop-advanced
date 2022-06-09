package core.basesyntax;

public class Square extends Figure {
    private int side;
    private String color = String.valueOf(ColorSupplier.getRandomColor());

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea() + " sq.units , side " + side
                + " units, color: " + color);
    }
}

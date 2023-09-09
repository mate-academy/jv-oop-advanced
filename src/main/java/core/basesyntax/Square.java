package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public String toString() {
        return "Figure: square, area: " + Math.pow(side, 2) + " sq.units, side: " + side
                + " units, color: " + new ColorSupplier().getRandomColor();
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public void draw() {
        System.out.println("Square was drawn");
    }
}

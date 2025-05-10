package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public void draw() {
        String randomColor = new ColorSupplier().getRandomColor();
        System.out.println("Figure: square, area: " + getArea() + " sq.units, side: " + side
                + " units, color: " + randomColor);
    }
}

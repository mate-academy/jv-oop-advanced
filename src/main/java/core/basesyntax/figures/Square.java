package core.basesyntax.figures;

public class Square extends Figure {
    private double side;

    public Square(double side, String color) {
        this.side = side;
        this.setColor(color);
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + area()
                + " units, side: " + side + " units, color: " + getColor());
    }
}

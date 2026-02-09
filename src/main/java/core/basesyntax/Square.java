package core.basesyntax;
public class Square extends Figure {
    private double side;

    public Square(double side,String color) {
        super(color);
        if (side <= 0) {
            throw new IllegalArgumentException("All dimensions must be positive");
        }
        this.side = side;
    }

    @Override
    public double area() {
        return this.side * this.side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: "
                + this.area() + " sq. units, side: "
                + this.side + ", color: " + getColor());
    }
}

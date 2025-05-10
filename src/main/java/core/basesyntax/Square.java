package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(double side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: "
                + String.format("%.1f", this.getArea())
                + " sq.units, side: " + String.format("%.1f", side)
                + " units, color: " + this.getColor());
    }
}

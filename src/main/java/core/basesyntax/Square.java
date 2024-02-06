package core.basesyntax;

public class Square extends Figure implements AreaCalculator {
    private int side;

    public Square(int side, Color color) {
        this.side = side;
        this.color = color;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + String.format("%.1f", this.getArea())
                + " sq.units, side: " + this.side
                + " units, color: " + this.color.toString().toLowerCase());
    }
}

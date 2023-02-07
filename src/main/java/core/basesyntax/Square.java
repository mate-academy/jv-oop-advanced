package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(double side, Color color) {
        this.side = side;
        this.setColor(color);
    }

    @Override
    public double obtainArea() {
        return side * side;
    }

    @Override
    public void toDraw() {
        System.out.println("Figure: Square, area: " + String.format("%.2f", obtainArea())
                + " sq.units, side: " + side + " units, color: " + getColor().name());
    }
}

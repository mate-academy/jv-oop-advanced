package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(double side, Color color) {
        this.side = side;
        this.setColor(color);
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square, area: " + String.format("%.2f", calculateArea())
                + " sq.units, side: " + side + " units, color: " + getColor().name());
    }
}

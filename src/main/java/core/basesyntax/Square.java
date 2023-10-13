package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(double side, Color color) {
        this.side = side;
        this.color = color;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, area: " + calculateArea()
                + "sq.units, side: " + side + " units, color: " + color);
    }
}

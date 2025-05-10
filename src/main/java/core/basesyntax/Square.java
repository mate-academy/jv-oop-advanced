package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(double side, Color color) {
        this.side = side;
        this.setColor(color);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + calculateArea()
                + " sq.units, side: " + side + "units, color: " + getColor());
    }
}

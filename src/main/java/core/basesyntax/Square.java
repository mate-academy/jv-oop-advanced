package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(double side, String color) {
        super(color);
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public String draw() {
        return "Figure: square, "
             + "area: " + this.getArea() + " sq.units, "
             + "side: " + side + " units, "
             + "color: " + this.getColor();
    }
}

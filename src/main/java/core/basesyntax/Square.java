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

    public void draw() {
        System.out.println("core.basesyntax.Figure: square, area: "
                + getArea() + " sq. units, side: " + side
                + " units, color: " + color);
    }
}

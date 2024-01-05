package core.basesyntax;

public class Square extends Figure {
    private double side;
    private final String color;

    Square(double side, String color) {
        this.side = side;
        this.color = color;
    }

    public void draw() {
        System.out.println(
                "Figure: square, area: " + getArea()
                        + " sq. units, side: " + this.side
                        + " units, color: " + this.color);
    }

    @Override
    double getArea() {
        return side * side;
    }
}

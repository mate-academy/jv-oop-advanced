package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square() {
    }

    public Square(String color) {
        super(color);
    }

    public Square(String color, double side) {
        super(color);
        this.side = side;
        area = side * side;
    }

    public void draw() {
        System.out.println("Figure: square, area: " + area + " sq.units,"
                + " side: " + side + " units,"
                + " color: " + color);
    }
}

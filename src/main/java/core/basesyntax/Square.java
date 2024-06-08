package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(double side, String color) {
        this.side = side;
        this.setColor(color);
    }

    public void draw() {
        System.out.printf("Figure: square, side"
                + side
                + ", area: "
                + this.calculateArea()
                + ", color: "
                + getColor().toLowerCase()
                + "\n"
        );
    }

    public double calculateArea() {
        double result = side * side;
        return Math.ceil(result);
    }
}

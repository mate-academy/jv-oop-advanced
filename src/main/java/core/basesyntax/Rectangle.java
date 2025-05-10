package core.basesyntax;

public class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle(double topSide, double leftSide, String color) {
        this.length = topSide;
        this.width = leftSide;
        this.setColor(color);
    }

    public void draw() {
        System.out.printf("Figure: rectangle, topSide "
                + length
                + ", leftSide: "
                + width
                + ", area: "
                + this.calculateArea()
                + ", color: "
                + getColor().toLowerCase()
                + "\n"
        );
    }

    public double calculateArea() {
        double result = length * width;
        return Math.ceil(result);
    }
}

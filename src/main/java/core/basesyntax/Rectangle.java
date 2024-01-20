package core.basesyntax;

public class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle(double length, double width, String color) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getDiagonal() {
        return Math.sqrt(length * length + width * width);
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public String draw() {
        return "Figure: Rectangle, area: " + String.format("%.2f", getArea())
                + " sq.units, length: " + String.format("%.2f", length)
                + ", width: " + String.format("%.2f", width)
                + " , diagonal: " + String.format("%.2f", getDiagonal())
                + " units, color:" + getColor();
    }

    @Override
    public String toString() {
        return draw();
    }

}

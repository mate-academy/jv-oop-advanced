package core.basesyntax;

public class Rectangle extends Figure {

    private double length;
    private double width;

    public Rectangle(String color, double width, double length) {
        super(color);
        this.width = width;
        this.length = length;
    }

    public Rectangle() {

    }

    public double calcArea() {
        return super.setArea(this.length * this.width);
    }

    @Override
    public String toString() {
        return "Figure: Rectangle, " +
                "area: " + calcArea() +
                " sq.units, width: " +
                width  +
                " units, length " +
                length +
                " units, color: " +
                super.getColor();
    }
}
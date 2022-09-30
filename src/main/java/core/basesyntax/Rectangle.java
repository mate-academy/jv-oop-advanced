package core.basesyntax;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String draw() {
        return "Figure: rectangle, area: " + getArea() + " sq.units, width: " + width
                + " units, height: " + height + " units, color: " + getColor().toLowerCase();
    }
}

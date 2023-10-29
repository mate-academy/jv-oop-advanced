package core.basesyntax;

public class Rectangle extends Figure {
    private double height;
    private double width;

    public Rectangle(String color, double height, double width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public double calculateArea() {
        return height * width;
    }

    @Override
    public String toString() {
        return "Figure: Rectangle, area: "
                + String.format("%.2f", calculateArea()) + " sq. units, height: "
                + String.format("%.0f", height)
                + " units, width: "
                + String.format("%.0f", width)
                + " units, color: "
                + getColor();
    }
}

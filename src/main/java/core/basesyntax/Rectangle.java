package core.basesyntax;

public class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public void displayProperty() {
        System.out.println("Figure: rectangle, color: " + super.getColor()
                + ", length size: " + length
                + ", width size: " + width + ", area: " + calculateArea());
    }
}

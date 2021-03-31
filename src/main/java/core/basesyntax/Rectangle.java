package core.basesyntax;

public class Rectangle extends Figure {
    private int height;
    private int width;

    public Rectangle(int height, int width, String color, String property) {
        super(color, property);
        this.height = height;
        this.width = width;
        calculateArea();
    }

    @Override
    public double calculateArea() {
        return (height * width);
    }

    @Override
    public String draw() {
        return "Figure{Rectangle , area: "
                + String.format("%.1f", calculateArea()) + " sq. units, "
                + getProperty() + ": " + width
                + " units, color: " + getColor()
                + '}';
    }
}

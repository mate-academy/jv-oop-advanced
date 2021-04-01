package core.basesyntax;

public class Rectangle extends Figure {
    private int height;
    private int width;

    public Rectangle(int height, int width, String color) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return (height * width);
    }

    @Override
    public String draw() {
        return "Figure{Rectangle , area: "
                + String.format("%.1f", calculateArea()) + " sq. units, "
                + "width: " + width
                + " units, color: " + getColor()
                + '}';
    }
}

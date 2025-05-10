package core.basesyntax;

public class Rectangle extends Figure {
    private final double width;
    private final double height;

    public Rectangle(Color color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return round(width * height);
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: rectangle"
                        + ", width: " + round(width) + " units"
                        + ", height: " + round(height) + " units"
                        + ", area: " + calculateArea() + " sq. units"
                        + ", color: " + color
        );
    }
}

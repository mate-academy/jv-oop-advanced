package core.basesyntax;

public class Rectangle extends Figure {
    private final double height;
    private final double width;

    public Rectangle(String color, double height, double width) {
        this.color = color;
        this.width = width;
        this.height = height;
    }

    public void draw() {
        System.out.println("Figure: rectangle, area: " + getAreaCalculator() + " sq.units,"
                + " height: " + height + " units,"
                + " width: " + width + " units,"
                + " color: " + color);
    }

    @Override
    public double getAreaCalculator() {
        return width * height;
    }
}


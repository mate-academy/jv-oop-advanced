package core.basesyntax;

public class Rectangle implements Figure {
    private String color;
    private double width;
    private double height;

    public Rectangle(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Drawable: rectangle, area: " + getArea()
                + " width: " + width
                + " height: " + height
                + " color: " + color);

    }
}

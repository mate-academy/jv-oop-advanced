package core.basesyntax;

public class Rectangle implements Figure {

    private double height;
    private double width;
    private String color;

    public Rectangle(double height, double width, String color) {
        this.height = height;
        this.width = width;
        this.color = color;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle [\n"
                + "Color: " + color + ", Length: " + height + ", Width: " + width
                + ",\n Area: " + getArea() + "]");
    }
}

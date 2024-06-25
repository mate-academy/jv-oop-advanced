package core.basesyntax;

public class Rectangle implements Figure {
    private String color;
    private double height;
    private double width;

    public Rectangle(String color, double height, double width) {
        this.color = color;
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle: color="
                + color
                + ", height="
                + height
                + ", width="
                + width
                + ", area="
                + getArea());
    }
}

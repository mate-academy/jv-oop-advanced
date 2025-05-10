package core.basesyntax;

public class Rectangle implements Figure {
    private double width;
    private double height;
    private String color;

    public Rectangle(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Figure: rectangle, area %.2f, width: %.2f, "
                + "height: %.2f, rectangle color: %s",
                getArea(), width, height, color));
    }
}

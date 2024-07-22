package core.basesyntax;

public class Rectangle implements Figure {
    private String color;
    private double width;
    private double height;

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
        System.out.println("Figure: rectangle, area: "
                + getArea()
                + " sq. units, width: "
                + width
                + " units, height: "
                + height + " units, color: "
                + color);
    }

    @Override
    public String getColor() {
        return color;
    }
}

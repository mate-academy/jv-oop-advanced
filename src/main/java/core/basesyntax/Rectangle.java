package core.basesyntax;

public class Rectangle extends Shape {
    private double height;
    private double width;

    public Rectangle(Color color, double height, double width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return height * width;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: rectangle, area: %s, height: %s, width: %s, color: %s%n",
                calculateArea(), height, width, getColor());
    }
}

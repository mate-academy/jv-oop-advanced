package core.basesyntax;

public class Rectangle extends Figure {
    private double height;
    private double width;

    public Rectangle(String color, double height, double width) {
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
        System.out.printf("Figure: Rectangle | height: %.2f | width: %.2f | area: %.2f |"
                        + " color: %s\n",
                height, width, calculateArea(), getColor());
    }
}

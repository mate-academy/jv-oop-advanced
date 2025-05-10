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
        System.out.println("Figure: Rectangle, area: "
                + String.format("%.2f", calculateArea()) + " sq. units, height: "
                + String.format("%.0f", height)
                + " units, width: "
                + String.format("%.0f", width)
                + " units, color: "
                + getColor());
    }
}

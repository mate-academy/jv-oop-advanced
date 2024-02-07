package core.basesyntax;

public class Rectangle extends Figure {
    private final double height;
    private final double width;
    private final String color;

    public Rectangle(double height, double width, String color) {
        this.color = color;
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public void getDraw() {
        System.out.println("Figure: Rectangle" + ", Color: " + color + ", area: " + getArea());
    }

}

package core.basesyntax;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String draw() {
        return super.draw() + System.out.printf("Width: %s, Height: %s", width, height);
    }
}

package core.basesyntax;

public class Rectangle extends Figure {
    private double width = 0;
    private double height = 0;

    public Rectangle() {
    }

    public Rectangle(double width, double height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    double getArea() {
        return width * height;
    }

    @Override
    public String draw() {
        return super.draw() + System.out.printf("Width: %s, Height: %s", width, height);
    }
}

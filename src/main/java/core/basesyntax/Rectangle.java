package core.basesyntax;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;//
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("width: " + width + " units, height: " + height + " units");
    }

    @Override
    public double getArea() {
        return width * height;
    }
}

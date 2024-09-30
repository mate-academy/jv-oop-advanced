package core.basesyntax;

public class Rectangle extends Figure {
    private static final int DIVIDER_FOR_AREA = 2;
    private int bothside;
    private int height;

    public Rectangle(String color, int bothside, int height) {
        super(color);
        this.bothside = bothside;
        this.height = height;

    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle");
        System.out.println("Color: " + getColor());
        System.out.println("Both side length: " + bothside);
        System.out.println("Height length: " + height);
    }

    @Override
    public double getArea() {
        return (double) (bothside * height) / DIVIDER_FOR_AREA;
    }
}

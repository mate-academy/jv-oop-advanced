package core.basesyntax;

public class Rectangle extends Figure {
    private int height;
    private int width;
    private String color = getColor();

    public Rectangle(int height, int width, String color) {
        this.height = height;
        this.width = width;
        this.color = color;
    }

    @Override
    public double areaCalculator() {
        return (height * width);
    }

    @Override
    public void draw() {
        System.out.println("Figure rectangle, area: " + areaCalculator()
                + ", height " + height + ", width " + width
                + ", color: " + color);
    }
}

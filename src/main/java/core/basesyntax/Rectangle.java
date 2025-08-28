package core.basesyntax;

public class Rectangle extends Figure {
    private int width;
    private int height;

    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle: "
                + "color: " + getColor()
                + ", width: " + getWidth()
                + ", height: " + getHeight()
                + ", area: " + getArea());
    }

    @Override
    double getArea() {
        double area = width * height;
        return Math.round(area * NUMBER_FOR_ROUND) / NUMBER_FOR_ROUND;
    }
}

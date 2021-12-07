package core.basesyntax;

public class Rectangle extends Figure {

    private int width;
    private int height;

    public Rectangle(int width, int height, Color color) {
        this.width = width;
        this.height = height;
        super.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle, color: " + color.toString()
                + ", width: " + width
                + ", height: " + height
                + ", area: " + getArea() + " sq.units.");
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
